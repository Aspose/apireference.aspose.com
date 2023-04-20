---
title: Class MutationObserver
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.Mutations.MutationObserver klass. AMutationObserver objekt kan användas för att observera mutationer i trädet avNode .
type: docs
weight: 1120
url: /sv/net/aspose.svg.dom.mutations/mutationobserver/
---
## MutationObserver class

A`MutationObserver` objekt kan användas för att observera mutationer i trädet av[`Node`](../../aspose.svg.dom/node/) .

```csharp
public class MutationObserver : DOMObject
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [MutationObserver](mutationobserver/)(MutationCallback) | Konstruerar ett MutationObserver-objekt och ställer in dess[`MutationCallback`](../mutationcallback/) att ringa tillbaka. Återuppringningen anropas med en lista med MutationRecord-objekt som första argument och det konstruerade MutationObserver-objektet som andra argument. Det anropas efter noder registrerade med!:Observe(Node, IMutationObserverInit) metod, är muterade. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Disconnect](../../aspose.svg.dom.mutations/mutationobserver/disconnect/)() | Stoppar observatören från att observera några mutationer. Tills metoden observe() används igen kommer observatörens återuppringning inte att anropas. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Denna metod används för att hämta ECMAScript-objektType . |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe)(Node) | Instruerar användaragenten att observera ett givet mål (en nod) och rapportera eventuella mutationer baserat på kriterierna som ges av optioner (ett objekt). Alternativargumentet tillåter att ställa in alternativ för mutationsobservation via objektmedlemmar. |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe_1)(Node, MutationObserverInit) | Instruerar användaragenten att observera ett givet mål (en nod) och rapportera eventuella mutationer baserat på kriterierna som ges av optioner (ett objekt). Alternativargumentet tillåter att ställa in alternativ för mutationsobservation via objektmedlemmar. |
| [TakeRecords](../../aspose.svg.dom.mutations/mutationobserver/takerecords/)() | Metoden returnerar en kopia av postkön och tömmer sedan postkön. |

### Se även

* class [DOMObject](../../aspose.svg.dom/domobject/)
* namnutrymme [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* hopsättning [Aspose.SVG](../../)


