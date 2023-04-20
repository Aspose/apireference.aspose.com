---
title: Interface ITraversal
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Traversal.ITraversal arayüz. Yineleyiciler örneğin bir NodeListteki düğüm kümesi belirli bir Düğüm tarafından yönetilen belge alt ağacı bir sorgunun sonuçları veya başka herhangi bir düğüm kümesi gibi bir dizi düğüm arasında ilerlemek için kullanılır. Yinelenecek düğüm kümesi NodeIteratorın uygulaması tarafından belirlenir. DOM Düzey 2 bir belge alt ağacının belge sırası geçişi için bir tek NodeIterator uygulamasını belirtir. Bu yineleyicilerin örnekleri DocumentTraversal .createNodeIterator. çağrılarak oluşturulur.
type: docs
weight: 1260
url: /tr/net/aspose.svg.dom.traversal/itraversal/
---
## ITraversal interface

Yineleyiciler, örneğin bir NodeList'teki düğüm kümesi, belirli bir Düğüm tarafından yönetilen belge alt ağacı, bir sorgunun sonuçları veya başka herhangi bir düğüm kümesi gibi bir dizi düğüm arasında ilerlemek için kullanılır. Yinelenecek düğüm kümesi, NodeIterator'ın uygulaması tarafından belirlenir. DOM Düzey 2, bir belge alt ağacının belge sırası geçişi için bir tek NodeIterator uygulamasını belirtir. Bu yineleyicilerin örnekleri DocumentTraversal .createNodeIterator(). çağrılarak oluşturulur.

Ayrıca bkz.[Belge nesnesi Modeli (DOM) Düzey 2 Geçiş ve Aralık Spesifikasyonu](http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113). @dOM Düzey 2 beri

```csharp
public interface ITraversal : IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Filter](../../aspose.svg.dom.traversal/itraversal/filter/) { get; } | Düğümleri taramak için kullanılan NodeFilter. |
| [Root](../../aspose.svg.dom.traversal/itraversal/root/) { get; } | it oluşturulduğunda belirtildiği gibi, NodeIterator'ın kök düğümü. |
| [WhatToShow](../../aspose.svg.dom.traversal/itraversal/whattoshow/) { get; } | Bu öznitelik, yineleyici aracılığıyla hangi düğüm türlerinin sunulacağını belirler. Kullanılabilir sabitler kümesi, NodeFilter arabiriminde tanımlanır. WhatToShow tarafından tarafından kabul edilmeyen düğümler atlanacak, ancak alt öğeleri yine de olarak değerlendirilebilir. Bu atlamanın, varsa filtresinden öncelikli olduğunu unutmayın. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* toplantı [Aspose.SVG](../../)


