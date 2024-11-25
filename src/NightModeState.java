class NightModeState implements LightState {
    @Override
    public void pressButton(LightingContext context) {
        System.out.println("Turning off the light...");
        context.setState(new OffState());
    }
}
