---
title: Document.CreateNodeIterator
second_title: Aspose.SVG för .NET API Referens
description: Document metod. Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden.
type: docs
weight: 900
url: /sv/net/aspose.svg.dom/document/createnodeiterator/
---
## CreateNodeIterator(Node) {#createnodeiterator}

Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden.

```csharp
public INodeIterator CreateNodeIterator(Node root)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| root | Node | nod som kommer att itereras tillsammans med sina barn. Iteratorn är initialt placerad precis före denna nod. The whatToShow-flaggor och filtret, om det finns, beaktas inte när denna position ställs in. Roten får inte vara null. |

### Returvärde

Den nyskapade NodeIterator.

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Ökas om den angivna roten är null. |

### Se även

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* class [Document](../)
* namnutrymme [Aspose.Svg.Dom](../../document/)
* hopsättning [Aspose.SVG](../../../)

---

## CreateNodeIterator(Node, long) {#createnodeiterator_1}

Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden.

```csharp
public INodeIterator CreateNodeIterator(Node root, long whatToShow)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| root | Node | nod som kommer att itereras tillsammans med sina barn. Iteratorn är initialt placerad precis före denna nod. The whatToShow-flaggor och filtret, om det finns, beaktas inte när denna position ställs in. Roten får inte vara null. |
| whatToShow | Int64 | flaggan anger vilka nodtyper som kan visas i den logiska vyn av trädet som presenteras av iteratorn. Se beskrivningen av NodeFilter för uppsättningen av möjliga SHOW_-värden. Dessa flaggor kan kombineras med OR. |

### Returvärde

Den nyskapade NodeIterator.

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Ökas om den angivna roten är null. |

### Se även

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* class [Document](../)
* namnutrymme [Aspose.Svg.Dom](../../document/)
* hopsättning [Aspose.SVG](../../../)

---

## CreateNodeIterator(Node, long, INodeFilter) {#createnodeiterator_2}

Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden.

```csharp
public INodeIterator CreateNodeIterator(Node root, long whatToShow, INodeFilter filter)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| root | Node | nod som kommer att itereras tillsammans med sina barn. Iteratorn är initialt placerad precis före denna nod. The whatToShow-flaggor och filtret, om det finns, beaktas inte när denna position ställs in. Roten får inte vara null. |
| whatToShow | Int64 | flaggan anger vilka nodtyper som kan visas i den logiska vyn av trädet som presenteras av iteratorn. Se beskrivningen av NodeFilter för uppsättningen av möjliga SHOW_-värden. Dessa flaggor kan kombineras med OR. |
| filter | INodeFilter | NodeFilter som ska användas med this TreeWalker, eller null för att indikera inget filter. |

### Returvärde

Den nyskapade NodeIterator.

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Ökas om den angivna roten är null. |

### Se även

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* interface [INodeFilter](../../../aspose.svg.dom.traversal/inodefilter/)
* class [Document](../)
* namnutrymme [Aspose.Svg.Dom](../../document/)
* hopsättning [Aspose.SVG](../../../)


