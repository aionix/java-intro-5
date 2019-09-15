//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ForTesting {
//    public static void main(String[] args) {
//        int[] array = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
//
//        verifyHintsContainText();
//
//    }
//
//        public static void verifyHintsContainText() {
//            String search = "Dress";
//            List<String> searchResult = new ArrayList<>();
//            List<String> filteredSearchResult = new ArrayList<>();
//
//            searchResult.add("asd Dress");
//            searchResult.add("String search = \"Dress\";");
//            searchResult.add("Blouses > Google");
//            searchResult.add("Blouses > Yandex");
//
//
//            //Adding Hints which don't contain search String
//            searchResult.forEach(i -> { if (!(i.contains(search))) {
//                filteredSearchResult.add(i);
//            }});
//
//            Assert.assertTrue(String.format("Not all Hints contain %s", search), searchResult.stream().allMatch(i -> {
//                if (!i.contains(search)) {
//                    for (String s : searchResult){
//                        if (!(s.contains(search))) System.out.println(s);
//                    } return false;
//                } return true;
//            }));
//
//
//        }
//    }
