---
title: Interface ICircularString
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.ICircularString arayüz. Noktalar arasında dairesel enterpolasyona sahip çok köşeli bir eğri.
type: docs
weight: 960
url: /tr/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

Noktalar arasında dairesel enterpolasyona sahip çok köşeli bir eğri.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## yöntemler

| İsim | Tanım |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |

### Notlar

`dairesel dize` uç uca bağlı bir veya daha fazla dairesel yay parçasından oluşur. İlk üç nokta, ilk bölümü tanımlar. İlk nokta, yayın başlangıç noktasıdır. İkinci nokta, yayın başlangıç veya bitiş noktası dışındaki herhangi bir ara noktasıdır. Üçüncü nokta, yayın sonudur. Sonraki yaylar yalnızca ara ve bitiş noktalarıyla tanımlanır, çünkü başlangıç noktası dolaylı olarak önceki bölümün bitiş noktası olarak tanımlanır.

### Ayrıca bakınız

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


