---
title: "System::Drawing::Region::Equals metod"
linktitle: "Lika"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Region::Equals metod. Avgör om den angivna regionen är identisk med regionen som representeras av det aktuella objektet på den angivna ritytan i C++."
type: docs
weight: 600
url: /sv/cpp/system.drawing/region/equals/
---
## Region::Equals method


Bestämmer om den angivna regionen är identisk med den region som representeras av det aktuella objektet på den angivna ritytan.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | Regionen att jämföra denna region med |
| g | const SharedPtr\<Graphics\>\& | En ritningsyta |

### ReturnValue

Sant om interiören i den angivna regionen är identisk med interiören i den region som representeras av det aktuella objektet när transformationen som är associerad med parametern **g** tillämpas; annars - falskt

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
