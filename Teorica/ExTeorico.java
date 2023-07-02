/*
O programa lê dados do ficheiro rainfall_data.csv, com o seguinte formato:
date, location, rainfall
2022-01-01, Lisboa, 6.23
2022-01-01, Porto, 8.14
Cada linha do ficheiro corresponde a uma leitura de precipitação, com um local, data, e valor.
Esta informação é representada através da classe Rainfallinfo.
Implemente as seguintes operações no código:
1) Leia o conteúdo do ficheiro, guardando o cabeçalho e as restantes linhas (linha 72)
2) Preencha a lista com objetos RainfallInfo, para representar a informação lida do ficheiro (linha 77)
3) Escreva para ecrã os valores de precipitação relativos à cidade "Porto" e todas as datas do mês de abril (linha 79)
4) Calcule, e guarde no mapa, as médias de precipitação por local (linha 85)
5) Escreva para ecrã as médias de precipitação por local (linha 88)
0 resultado esperado é:
File header: date, location, rainfall
Number of lines, excluding header: 159
Porto [2022-04-02]: 9.4
Porto [2022-04-09]: 3.8
Porto [2022-04-16]: 7.1
Porto [2022-04-23]: 3.5
Porto [2022-04-30]: 9.8
Location: Lisboa, Average Rainfall 8.01
Location: Porto, Average Rainfall 7.53
Location: Faro, Average Rainfall 7.52
*/

// import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class RainfallInfo {
    LocalDate date;
    String location;
    double rainfall;

    RainfallInfo(LocalDate date, String location, double rainfall) {
        this.date = date;
        this.location = location;
        this.rainfall = rainfall;
    }

    LocalDate getDate() {
        return date;
    }

    String getLocation() {
        return location;
    }

    double getRainfall() {
        return rainfall;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public class RainfallAverages {
        public static void main(String[] args) {
            String filePath = "rainfall_data.csv";
            List<String> lines = null;
            String header = null;
            try {
                lines = Files.readAllLines(Paths.get(filePath));
                header = lines.remove(0);
                System.out.printf("File header: %s\n", header);
                System.out.printf("Number of lines, excluding header: %d\n\n\n", lines == null ? 0 : lines.size());
                List<RainfallInfo> rainfallData = new ArrayList<>();
                // CODE HERE: Create list of information from file, represented as RainfallInfo
                while (lines.size() > 0) {
                    String[] line = lines.remove(0).split(",");
                    LocalDate date = LocalDate.parse(line[0]);
                    String location = line[1];
                    double rainfall = Double.parseDouble(line[2]);
                    rainfallData.add(new RainfallInfo(date, location, rainfall));
                }
                // CODE HERE: Print rainfall values for Porto and dates in April
                for (RainfallInfo rainfallInfo : rainfallData) {
                    if (rainfallInfo.getLocation().equals("Porto") && rainfallInfo.getDate().getMonth() == Month.APRIL) {
                        System.out.printf("%s [%s]: %.1f\n", rainfallInfo.getLocation(), rainfallInfo.getDate(),rainfallInfo.getRainfall());
                    }
                }

                System.out.println("\n");
                // Calculate average rainfall per location
                Map<String, ArrayList<Double>> rainfallPerLocation;
                rainfallPerLocation = new HashMap<>();
                for (RainfallInfo rainfallInfo : rainfallData) {
                    String location = rainfallInfo.getLocation();
                    double rainfall = rainfallInfo.getRainfall();
                    if (rainfallPerLocation.containsKey(location)) {
                        rainfallPerLocation.get(location).add(rainfall);
                    } else {
                        rainfallPerLocation.put(location, new ArrayList<Double>());
                        rainfallPerLocation.get(location).add(rainfall);
                    }
                }
                // CODE HERE: Print average rainfall per location
                for (Map.Entry<String, ArrayList<Double>> entry : rainfallPerLocation.entrySet()) {
                    String location = entry.getKey();
                    ArrayList<Double> rainfallValues = entry.getValue();
                    double average = 0;
                    for (Double value : rainfallValues) {
                        average += value;
                    }
                    average = average / rainfallValues.size();
                    System.out.printf("Location: %s, Average Rainfall %.2f\n", location, average);
                }
                System.out.println("\n");
            } catch (Exception e) { // Workaround to avoid codecheck error. Should be a more specific Exception
                                    // class.
                e.printStackTrace();
            }
        }
    }
}

// Expected Output
// File header: date, location, rainfall
// Number of lines, excluding header: 159
// Porto [2022-04-02]: 9.4
// Porto [2022-04-09]: 3.8
// Porto [2022-04-16]: 7.1
// Porto [2022-04-23]: 3.5
// Porto [2022-04-30]: 9.8
// Location: Lisboa, Average Rainfall 8.01
// Location: Porto, Average Rainfall 7.53
// Location: Faro, Average Rainfall 7.52