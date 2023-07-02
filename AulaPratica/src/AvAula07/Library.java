package AvAula07;

import java.util.ArrayList;

public class Library implements ILibrary {
	private ArrayList<LibraryItem> items;

	public Library() {
		items = new ArrayList<LibraryItem>();
	}

	public void addItem(LibraryItem item) {
		items.add(item);
	}

	public void removeItem(LibraryItem item) {
		items.remove(item);
	}

	public ArrayList<LibraryItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<LibraryItem> items) {
		this.items = items;
	}

	public LibraryItem searchForItem(String title) {
		for (LibraryItem item : items) {
			if (item.getTitle().equals(title)) {
				return item;
			}
		}
		return null;
	}

	public boolean borrowItem(int itemId, String borrorName, int numberOfDays) {
		for (LibraryItem item : items) {
			if (item.getId() == itemId) {
				return item.borrow(borrorName, numberOfDays);
			}
		}
		return false;
	}

	public boolean returnItem(int itemId) {
		for (LibraryItem item : items) {
			if (item.getId() == itemId) {
				return item.returnItem();
			}
		}
		return false;
	}

	public void printInventory() {
		for (LibraryItem item : items) {
			System.out.println(item);
		}
	}

	@Override
	public String toString() {
		return "[Library: items=" + items + "]";
	}

}