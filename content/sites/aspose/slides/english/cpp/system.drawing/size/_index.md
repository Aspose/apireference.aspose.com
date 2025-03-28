---
title: Size
second_title: Aspose.Slides for C++ API Reference
description: "Represents a pair of integer values that represent width and height of an image. This type should be allocated on stack and passed to functions by value or by reference. Never use System::SmartPtr class to manage objects of this type."
type: docs
weight: 274
url: /cpp/system.drawing/size/
---
## Size class


Represents a pair of integer values that represent width and height of an image. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../../system/smartptr/) class to manage objects of this type.

```cpp
class Size
```

## Methods

| Method | Description |
| --- | --- |
| static [Size](./) [Add](./add/)(const [Size](./)\&, const [Size](./)\&) | Returns a new [Size](./) object that is a sum of the specified [Size](./) object, i.e. whose width value is equal to the sum of width values of the specified objects and height value is equal to the sum of height values of the specified objects. |
| static [Size](./) [Ceiling](./ceiling/)(const [SizeF](../sizef/)\&) | Constructs a [Size](./) object from the specified [SizeF](../sizef/) object by rounding the [SizeF](../sizef/) object's width and height values to the next higher integer values. |
| **bool** [Equals](./equals/)(const [Size](./)\&) const | Determines if the current object and the specified object are equal, i.e. represent the same pair of width and hegiht values. |
| int [get_Height](./get_height/)() const | Returns the value of heght represented by the current object. |
| **bool** [get_IsEmpty](./get_isempty/)() const | Determines if both width and hegiht values are equal to 0. |
| int [get_Width](./get_width/)() const | Returns the value of width represented by the current object. |
| **int32_t** [GetHashCode](./gethashcode/)() const | Returns a hash code for the current object. |
|  [operator Point](./operator_point/)() const | Constructs an instance of [Point](../point/) object and initializes its X and Y coordinate with the current object's width and height values correspondingly. |
|  [operator SizeF](./operator_sizef/)() const | Constructs an instance of [SizeF](../sizef/) object and initializes it with width and hegiht values of the current [Size](./) object. |
| static [Size](./) [Round](./round/)(const [SizeF](../sizef/)\&) | Constructs a [Size](./) object from the specified [SizeF](../sizef/) object by rounding the [SizeF](../sizef/) object's width and height values to the nearest integer values. |
| void [set_Height](./set_height/)(int) | Sets the value of height represented by the current object. |
| void [set_Width](./set_width/)(int) | Sets the value of width represented by the current object. |
|  [Size](./size/)() | Constructs a new [Size](./) object and initializes its width and height values with 0. |
|  [Size](./size/)(const [Point](../point/)\&) | Constructs a new [Size](./) object and initializes its width and height values with the values of X and Y coordinates of the specifide point correspondingly. |
|  [Size](./size/)(int, int) | Constructs a new [Size](./) object and initializes it with the specified value. |
| static [Size](./) [Subtract](./subtract/)(const [Size](./)\&, const [Size](./)\&) | Returns a new [Size](./) object that is the results of subctraction of **size2** from **size1**, i.e. whose width value is the result of subtraction of **size2's** width value from **size1's** width value and height value is the result of subtraction of **size2's** height value from **size1's** height value. |
| [String](../../system/string/) [ToString](./tostring/)() const | Returns the string representation of the pair of width and hegiht values represented by the current object. |
| static [Size](./) [Truncate](./truncate/)(const [SizeF](../sizef/)\&) | Constructs a [Size](./) object from the specified [SizeF](../sizef/) object by truncating the [SizeF](../sizef/) object's width and height values to the next lower integer values. |
## Fields

| Field | Description |
| --- | --- |
| static [Empty](./empty/) | An empty instance of [Size](./) class whose width and height values are 0. |
## See Also

* Namespace [System::Drawing](../)
* Library [Aspose.Slides](../../)