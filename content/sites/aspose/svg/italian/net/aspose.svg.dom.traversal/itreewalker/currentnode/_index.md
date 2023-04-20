---
title: ITreeWalker.CurrentNode
second_title: Riferimento API Aspose.SVG per .NET
description: ITreeWalker proprietà. Il nodo in cui il TreeWalker è attualmente posizionato. Le modifiche allalbero DOM possono far sì che il nodo corrente non sia più accettato dal filtro associato del TreeWalker. currentNode può anche essere impostato esplicitamente su qualsiasi nodo indipendentemente dal fatto che lo sia o meno allinterno della sottostruttura specificata dal nodo radice o verrebbe accettato dal filtro e dai flag whatToShow. Lulteriore attraversamento avviene rispetto a currentNode anche se non fa parte della vista corrente applicando i filtri nella direzione richiesta se nessun traversal è possibile currentNode non viene modificato.
type: docs
weight: 10
url: /it/net/aspose.svg.dom.traversal/itreewalker/currentnode/
---
## ITreeWalker.CurrentNode property

Il nodo in cui il TreeWalker è attualmente posizionato. Le modifiche all'albero DOM possono far sì che il nodo corrente non sia più accettato dal filtro associato del TreeWalker. currentNode può anche essere impostato esplicitamente su qualsiasi nodo, indipendentemente dal fatto che lo sia o meno all'interno della sottostruttura specificata dal nodo radice o verrebbe accettato dal filtro e dai flag whatToShow. L'ulteriore attraversamento avviene rispetto a currentNode anche se non fa parte della vista corrente, applicando i filtri nella direzione richiesta; se nessun traversal è possibile, currentNode non viene modificato.

```csharp
public Node CurrentNode { get; set; }
```

### Valore della proprietà

Il nodo corrente.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: generato se si tenta di impostare currentNode su null. |

### Guarda anche

* class [Node](../../../aspose.svg.dom/node/)
* interface [ITreeWalker](../)
* spazio dei nomi [Aspose.Svg.Dom.Traversal](../../itreewalker/)
* assemblea [Aspose.SVG](../../../)


