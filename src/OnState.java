class OnState implements LightState {
    @Override
    public void pressButton(LightingContext context) {
        System.out.println("Switching to night mode...");
        context.setState(new NightModeState());
    }
}
