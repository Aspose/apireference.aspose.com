---
title: "System::Drawing::Region::Equals метод"
linktitle: "Equals"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Region::Equals метод. Определяет, идентичен ли указанный регион региону, представленного текущим объектом, на указанной поверхности рисования в C++."
type: docs
weight: 600
url: /ru/cpp/system.drawing/region/equals/
---
## Region::Equals method


Определяет, идентичен ли указанный регион региону, представленному текущим объектом, на указанной поверхности рисования.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | Регион, с которым сравнивается данный регион |
| g | const SharedPtr\<Graphics\>\& | Поверхность для рисования |

### ReturnValue

True если внутреннее пространство указанного региона идентично внутреннему пространству региона, представленного текущим объектом, когда применяется преобразование, связанное с параметром **g**; иначе — false

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
