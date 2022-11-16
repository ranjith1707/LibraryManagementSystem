package model;

public class Book {
		private long id;
		private String title;
		private String author;
		private String publication;
		private String edition;
		private String journer;
		private int volume; 
		private boolean availablity;
		
		public Book(long id, String title, String author, String publication, String edition, String journer,
				int volume, boolean availablity) {
			this.id=id;
			this.title=title;
			this.author=author;
			this.publication=publication;
			this.edition=edition;
			this.journer=journer;
			this.volume=volume;
			this.availablity=availablity;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublication() {
			return publication;
		}

		public void setPublication(String publication) {
			this.publication = publication;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getEdition() {
			return edition;
		}

		public void setEdition(String edition) {
			this.edition = edition;
		}

		public boolean isAvailablity() {
			return availablity;
		}

		public void setAvailablity(boolean availablity) {
			this.availablity = availablity;
		}

		public String getJourner() {
			return journer;
		}

		public void setJourner(String journer) {
			this.journer = journer;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
}
