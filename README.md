# CeilingFan

Medavie Blue Cross Coding Assessment for Simran Farrukh. Received July 26th, 2022. 

## Description

Implement a simple ceiling fan with these characteristics: The unit has 2 pull cords:  
- One increases the speed each time it is pulled.  
There are 3-speed settings and an “off” (speed 0) setting. 
If the cord is pulled on speed 3, the fan returns to the “off” setting. 
- One reverses the direction of the fan at the current speed setting. 
Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

(You can assume the unit is always powered (no wall switch)).

## Usage

Run the ControlFan class to test the project.

## Implementations

- CordType: Interface of type of cords. Contains a pull() method.
- Speed: Enum that inherits CordType's pull() method. Contains speed values.
- Direction: Enum that inherits CordType's pull() method. Contains direction values.
- Fan: Class that allows implements CordType's pull() method and contains getters and setters for Speed and Direction types.
- ControlFan: The main class that shows the implementation.

## License
[MIT](https://choosealicense.com/licenses/mit/)
