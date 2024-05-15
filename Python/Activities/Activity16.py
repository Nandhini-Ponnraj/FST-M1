class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(" " + self.manufacturer + "  " + self.model + " is moving")

    def stop(self):
        print(" " + self.manufacturer + " " + self.model + " has stopped")


c1 = Car("Toyota", "X100", "2022", "manual", "blue")
c2 = Car("Maruti", "M100", "2020", "manual", "green")
c3 = Car("Tata", "V100", "2023", "manual", "black")

c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()
