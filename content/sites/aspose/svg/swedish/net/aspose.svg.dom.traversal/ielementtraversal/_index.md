---
title: Interface IElementTraversal
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.Traversal.IElementTraversal gränssnitt. ElementTraversalgränssnittet är en uppsättning skrivskyddade attribut som gör att en författare enkelt kan navigera mellan element i ett dokument. I överensstämmande implementeringar av Element Traversal måste alla objekt som implementerar Element också implementera ElementTraversalgränssnittet.
type: docs
weight: 1230
url: /sv/net/aspose.svg.dom.traversal/ielementtraversal/
---
## IElementTraversal interface

ElementTraversal-gränssnittet är en uppsättning skrivskyddade attribut som gör att en författare enkelt kan navigera mellan element i ett dokument. I överensstämmande implementeringar av Element Traversal måste alla objekt som implementerar Element också implementera ElementTraversal-gränssnittet.

```csharp
public interface IElementTraversal
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom.traversal/ielementtraversal/childelementcount/) { get; } | Returnerar det aktuella antalet elementnoder som är barn till detta element. 0 om detta element inte har några underordnade noder som är av nodeType 1. |
| [FirstElementChild](../../aspose.svg.dom.traversal/ielementtraversal/firstelementchild/) { get; } | Returnerar den första underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| [LastElementChild](../../aspose.svg.dom.traversal/ielementtraversal/lastelementchild/) { get; } | Returnerar den sista underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| [NextElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/nextelementsibling/) { get; } | Returnerar nästa syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer efter detta i dokumentträdet. |
| [PreviousElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/previouselementsibling/) { get; } | Returnerar föregående syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer före detta i dokumentträdet. |

### Se även

* namnutrymme [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* hopsättning [Aspose.SVG](../../)


