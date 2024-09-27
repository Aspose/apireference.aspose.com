---
title: Aspose::Pub::Utils::Coord class
linktitle: Coord
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::Utils::Coord class. This class designed to represent data related to coordinates of PUB fields. Every field in PUB holds coordinates has 2 pairs of coordinates: coordinates of upper-left corner (XLeft, YTop) and coordinates of bottom-right corner(XRight, YBottom). All coordinates represented in special metric system - English Metric Unit(EMUs). Additional methods were added into this class to transform coordinate values from english metric units into inches in C++.'
type: docs
weight: 100
url: /cpp/aspose.pub.utils/coord/
---
## Coord class


This class designed to represent data related to coordinates of PUB fields. Every field in PUB holds coordinates has 2 pairs of coordinates: coordinates of upper-left corner (XLeft, YTop) and coordinates of bottom-right corner(XRight, YBottom). All coordinates represented in special metric system - English Metric Unit(EMUs). Additional methods were added into this class to transform coordinate values from english metric units into inches.

```cpp
class Coord : public System::ICloneable
```

## Methods

| Method | Description |
| --- | --- |
| [CalculateHeight](./calculateheight/)() | Calculates height of figure(current Coord object) and returns result in inches. |
| [CalculateWidth](./calculatewidth/)() | Calculates width of figure(current Coord object) and returns result in inches. |
| [CalculateX](./calculatex/)(double) | Transforms value for X-coordinate from natural PUB metric system into inches. |
| [CalculateX](./calculatex/)() | Transforms value for X-coordinate from natural PUB metric system into inches. |
| [CalculateY](./calculatey/)(double) | Transforms value for Y-coordinate from natural PUB metric system into inches. |
| [CalculateY](./calculatey/)() | Transforms value for Y-coordinate from natural PUB metric system into inches. |
| [Clone](./clone/)() override | Created copy of object. |
| [Coord](./coord/)() | Constructor. |
| [Coord](./coord/)(int32_t, int32_t, int32_t, int32_t) | Constructor. |
| [get_XLeft](./get_xleft/)() const | X-coordinate of upper-left corner in EMUs. |
| [get_XRight](./get_xright/)() const | X-coordinate of bottom-right corner in EMUs. |
| [get_YBottom](./get_ybottom/)() const | Y-coordinate of bottom-right corner in EMUs. |
| [get_YTop](./get_ytop/)() const | Y-coordinate of upper-left corner in EMUs. |
| [GetHeight](./getheight/)() | Returns height of current [Coord](./) object in natural PUB metrics. |
| [GetWidth](./getwidth/)() | Returns width of current [Coord](./) object in natural PUB metrics. |
## See Also

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Pub::Utils](../)
* Library [Aspose.PUB for C++](../../)
