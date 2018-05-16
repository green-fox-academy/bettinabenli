public class FleetOfThings {

    public static void main(String[] args) {

        Thing thing1 = new Thing("Get milk"," ");
        Thing thing2 = new Thing("Remove the obstacles"," ");
        Thing thing3 = new Thing("Stand up","x");
        Thing thing4 = new Thing("Eat lunch","x");

        Fleet fleet = new Fleet();
        fleet.things.add(thing1);
        fleet.things.add(thing2);
        fleet.things.add(thing3);
        fleet.things.add(thing4);

        System.out.println(fleet.things);
    }
}
