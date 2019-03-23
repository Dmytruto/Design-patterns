class Book {
    private String coverType;
    private String printType;
    private String pageSize;
    private String fontFamily;
    private String fontSize;

    public static class BookBuilder {

        private Book book;

        BookBuilder() {
            book = new Book();
        }

        public Book GetBook() {
            return book;
        }

        public BookBuilder SetCoverType(String coverType) {
            book.coverType = coverType;
            return this;
        }

        public BookBuilder SetPrintType(String printType) {
            book.printType = printType;
            return this;
        }

        public BookBuilder SetPageSize(String pageSize) {
            book.pageSize = pageSize;
            return this;
        }

        public BookBuilder SetFontFamily(String fontFamily) {
            book.fontFamily = fontFamily;
            return this;
        }

        public BookBuilder SetFontSize(String fontSize) {
            book.fontSize = fontSize;
            return this;
        }


    }

    @Override
    public String toString() {
        return coverType + " " + printType + " " + pageSize + " " + fontFamily + " " + fontSize;
    }
}

//class CheapBookBuilder extends BookBuilder{
//
//    public void SetCoverTyoe(){
//        this.book.coverType = "soft";
//    }
//
//    public void SetPrintTyoe(){
//        this.book.printType = "risograph";
//    }
//
//    public void SetPageSize(){
//        this.book.pageSize = "129 mm × 198 mm";
//    }
//
//    public void SetFontFamily(){
//        this.book.fontFamily = "Colibri";
//    }
//
//    public void SetFontSize(){
//        this.book.fontSize = "14";
//    }
//
//}
//
//
//class ExpensiveBookBuilder extends BookBuilder{
//
//    public void SetCoverTyoe(){
//        this.book.coverType = "hardСardboard";
//    }
//
//    public void SetPrintTyoe(){
//        this.book.printType = "offset";
//    }
//
//    public void SetPageSize(){
//        this.book.pageSize = "129 mm × 198 mm";
//    }
//
//    public void SetFontFamily(){
//        this.book.fontFamily = "Times New Roman";
//    }
//
//    public void SetFontSize(){
//        this.book.fontSize = "12";
//    }
//}
