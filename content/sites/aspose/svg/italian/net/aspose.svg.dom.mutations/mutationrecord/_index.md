---
title: Class MutationRecord
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Mutations.MutationRecord classe. Un MutationRecord rappresenta una singola mutazione DOM. È loggetto a cui viene passatoMutationObserver SMutationCallback .
type: docs
weight: 1140
url: /it/net/aspose.svg.dom.mutations/mutationrecord/
---
## MutationRecord class

Un MutationRecord rappresenta una singola mutazione DOM. È l'oggetto a cui viene passato[`MutationObserver`](../mutationobserver/) S[`MutationCallback`](../mutationcallback/) .

```csharp
public class MutationRecord : DOMObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AddedNodes](../../aspose.svg.dom.mutations/mutationrecord/addednodes/) { get; } | Restituisce i nodi aggiunti. |
| [AttributeName](../../aspose.svg.dom.mutations/mutationrecord/attributename/) { get; } | Restituisce il nome locale dell'attributo modificato e null in caso contrario. |
| [AttributeNamespace](../../aspose.svg.dom.mutations/mutationrecord/attributenamespace/) { get; } | Restituisce lo spazio dei nomi dell'attributo modificato e null in caso contrario. |
| [NextSibling](../../aspose.svg.dom.mutations/mutationrecord/nextsibling/) { get; } | Restituisce il fratello successivo dei nodi aggiunti o rimossi, oppure null. |
| [OldValue](../../aspose.svg.dom.mutations/mutationrecord/oldvalue/) { get; } | Il valore restituito dipende dal tipo. Per "attributi", è il valore dell'attributo modificato prima della modifica. Per "characterData", è il dato del nodo modificato prima della modifica. Per "childList", è nullo. |
| [PreviousSibling](../../aspose.svg.dom.mutations/mutationrecord/previoussibling/) { get; } | Restituisce il fratello precedente dei nodi aggiunti o rimossi, oppure null. |
| [RemovedNodes](../../aspose.svg.dom.mutations/mutationrecord/removednodes/) { get; } | Restituisce i nodi rimossi. |
| [Target](../../aspose.svg.dom.mutations/mutationrecord/target/) { get; } | Restituisce il nodo interessato dalla mutazione, a seconda del tipo. Per "attributi", è l'elemento il cui attributo è cambiato. Per "characterData", è il nodo CharacterData. Per "childList", è il nodo i cui figli sono cambiati. |
| [Type](../../aspose.svg.dom.mutations/mutationrecord/type/) { get; } | Restituisce "attributes" se si trattava di una mutazione di attributo, "characterData" se si trattava di una mutazione di un nodo CharacterData e "childList" se si trattava di una mutazione dell'albero dei nodi. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject/)
* spazio dei nomi [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* assemblea [Aspose.SVG](../../)


