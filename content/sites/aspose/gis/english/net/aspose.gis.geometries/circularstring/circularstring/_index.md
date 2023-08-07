---
title: CircularString.CircularString
second_title: Aspose.GIS for .NET API Reference
description: CircularString constructor. Initializes a new instance of the CircularString class
type: docs
weight: 10
url: /net/aspose.gis.geometries/circularstring/circularstring/
---
## CircularString() {#constructor}

Initializes a new instance of the [`CircularString`](../) class.

```csharp
public CircularString()
```

### See Also

* class [CircularString](../)
* namespace [Aspose.Gis.Geometries](../../circularstring/)
* assembly [Aspose.GIS](../../../)

---

## CircularString(IEnumerable&lt;IPoint&gt;) {#constructor_2}

Initializes a new instance of the [`CircularString`](../) class.

```csharp
public CircularString(IEnumerable<IPoint> collection)
```

| Parameter | Type | Description |
| --- | --- | --- |
| collection | IEnumerable`1 | The collection of points. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |
| InvalidOperationException | Any point is empty (its [`IsEmpty`](../../igeometry/isempty/) is `true`). |

### See Also

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* namespace [Aspose.Gis.Geometries](../../circularstring/)
* assembly [Aspose.GIS](../../../)

---

## CircularString(ICircularString) {#constructor_1}

Initializes a new instance of the [`CircularString`](../) class.

```csharp
public CircularString(ICircularString other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | ICircularString | The other string to copy data from. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |

### See Also

* interface [ICircularString](../../icircularstring/)
* class [CircularString](../)
* namespace [Aspose.Gis.Geometries](../../circularstring/)
* assembly [Aspose.GIS](../../../)


