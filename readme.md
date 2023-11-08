## This is a dog walking app for my wife

it records paths on a map and allows the user to record events on the dog walk

## Development policies

* strict dependency inversion. An interface shall only use other interfaces. An implementation shall
  use only other interfaces
* implementation modules have very high test coverage requirements
* UI code should not have any conditional logic. This is not strict. Compose requires some
  conditional logic, but the conditions should only be for the presentation of data