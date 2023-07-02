package AvAula07;

public abstract class LibraryItem {
	private static int idCount = 101;
	private int id;
	private String title;
	private String borrower;
	private int borrowDays;
	
	public LibraryItem(String title) {
		this.id = idCount++;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getBorrower() {
		return borrower;
	}
	
	public int getBorrowDays() {
		return borrowDays;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public void setBorrowDays(int borrowDays) {
		this.borrowDays = borrowDays;
	}
	
	public boolean borrow(String borrower, int borrowDays) {
		if (this.borrower == null) {
			this.borrower = borrower;
			this.borrowDays = borrowDays;
			return true;
		}
		return false;
	}
	
	public boolean returnItem() {
		if (this.borrower != null) {
			this.borrower = null;
			this.borrowDays = 0;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", borrower=" + borrower + ", borrowDays=" + borrowDays;
	}

}