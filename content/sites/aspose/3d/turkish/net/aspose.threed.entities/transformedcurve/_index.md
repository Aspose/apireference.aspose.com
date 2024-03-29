---
title: TransformedCurve
second_title: Aspose.3D for .NET API Referansı
description: ATransformedCurve./transformedcurve bir dönüşüm matrisi kullanarak bir eğriye yerleşim verir. Bu birTrimmedCurve./trimmedcurve veyaCompositeCurve./compositecurve .
type: docs
weight: 720
url: /tr/net/aspose.threed.entities/transformedcurve/
---
## TransformedCurve class

A[`TransformedCurve`](../transformedcurve) bir dönüşüm matrisi kullanarak bir eğriye yerleşim verir. Bu, bir[`TrimmedCurve`](../trimmedcurve) veya[`CompositeCurve`](../compositecurve) .

```csharp
public class TransformedCurve : Curve
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [TransformedCurve](transformedcurve#constructor)() | yapıcısı[`TransformedCurve`](../transformedcurve) |
| [TransformedCurve](transformedcurve#constructor_1)(Curve, Matrix4) | yapıcısı[`TransformedCurve`](../transformedcurve) |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [BasisCurve](../../aspose.threed.entities/transformedcurve/basiscurve) { get; set; } | Temel eğri. |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Çizginin rengini alır veya ayarlar, varsayılan değer beyazdır(1, 1, 1) |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [TransformMatrix](../../aspose.threed.entities/transformedcurve/transformmatrix) { get; set; } | Dönüşüm matrisi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |

### Ayrıca bakınız

* class [Curve](../curve)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
