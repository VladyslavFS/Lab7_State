class OffState implements LightState {
    @Override
    public void pressButton(LightingContext context) {
        System.out.println("Turning on the light...");
        context.setState(new OnState());
    }
}
