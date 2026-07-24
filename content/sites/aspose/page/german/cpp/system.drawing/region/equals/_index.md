---
title: "System::Drawing::Region::Equals Methode"
linktitle: "Gleich"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Region::Equals Methode. Bestimmt, ob die angegebene Region identisch ist mit der Region, die vom aktuellen Objekt auf der angegebenen Zeichenfläche in C++ dargestellt wird."
type: docs
weight: 600
url: /de/cpp/system.drawing/region/equals/
---
## Region::Equals method


Bestimmt, ob die angegebene Region identisch ist mit der von dem aktuellen Objekt dargestellten Region auf der angegebenen Zeichenfläche.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | Die Region, mit der diese Region verglichen werden soll |
| g | const SharedPtr\<Graphics\>\& | Eine Zeichenfläche |

### ReturnValue

Wahr, wenn das Innere der angegebenen Region identisch ist mit dem Inneren der Region, die vom aktuellen Objekt repräsentiert wird, wenn die mit dem Parameter **g** verbundene Transformation angewendet wird; andernfalls - falsch

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
