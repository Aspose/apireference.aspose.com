---
title: Interface IElementTraversal
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Traversal.IElementTraversal arayüz. ElementTraversal arabirimi bir yazarın bir belgedeki öğeler arasında kolayca gezinmesini sağlayan bir dizi salt okunur özniteliktir. Element Traversalın uyumlu uygulamalarında Elementi uygulayan tüm nesnelerin ElementTraversal arayüzünü de uygulaması gerekir.
type: docs
weight: 1230
url: /tr/net/aspose.svg.dom.traversal/ielementtraversal/
---
## IElementTraversal interface

ElementTraversal arabirimi, bir yazarın bir belgedeki öğeler arasında kolayca gezinmesini sağlayan bir dizi salt okunur özniteliktir. Element Traversal'ın uyumlu uygulamalarında, Element'i uygulayan tüm nesnelerin ElementTraversal arayüzünü de uygulaması gerekir.

```csharp
public interface IElementTraversal
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom.traversal/ielementtraversal/childelementcount/) { get; } | Bu öğenin çocukları olan öğe düğümlerinin geçerli sayısını döndürür. 0, eğer bu elemanın nodeType 1. olan alt düğümleri yoksa |
| [FirstElementChild](../../aspose.svg.dom.traversal/ielementtraversal/firstelementchild/) { get; } | Bu öğenin ilk alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| [LastElementChild](../../aspose.svg.dom.traversal/ielementtraversal/lastelementchild/) { get; } | Bu öğenin son alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| [NextElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/nextelementsibling/) { get; } | Bu öğenin bir sonraki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan sonra gelen hiçbir öğe kardeş düğümü yoksa boş değer. |
| [PreviousElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/previouselementsibling/) { get; } | Bu öğenin önceki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan önce gelen hiçbir öğe kardeş düğümü yoksa boş değer. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* toplantı [Aspose.SVG](../../)


