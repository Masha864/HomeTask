public class FigureOperator {

        private static final Comparator<Figure> BY_AREA = Comparator.comparingDouble(Figure::getArea);
        private static final Comparator<Figure> BY_PERIMETER = Comparator.comparingDouble(Figure::getPerimeter);

        private List<Figure> figureList;

        public enum SortPropertyType {
            AREA(BY_AREA), PERIMETER(BY_PERIMETER);

            private final Comparator<Figure> correspondingComparator;

            SortPropertyType(final Comparator<Figure> correspondingComparator) {
                this.correspondingComparator = correspondingComparator;
            }

            public Comparator<Figure> getCorrespondingComparator() {
                return correspondingComparator;
            }
        }

        public FigureOperator() {
            this.figureList = new ArrayList<>();
        }

        public void addFigure(final Figure figure) {
            figureList.add(figure);
        }

        public void sortFigures(final SortPropertyType type) {
            figureList.sort(type.getCorrespondingComparator());
        }

        @Override
        public String toString() {
            StringJoiner stringJoiner = new StringJoiner("\n");
            for (final Figure figure : figureList) {
                stringJoiner.add("Figure : " + figure.getClass() + ", S = " + figure.getArea() + ", p = " + figure.getPerimeter());
            }
            return stringJoiner.toString();
        }

        private double getArea(final Figure figure) {
            return figure.getArea();
        }

        private double getPerimeter(final Figure figure) {
            return figure.getPerimeter();
        }
    }


