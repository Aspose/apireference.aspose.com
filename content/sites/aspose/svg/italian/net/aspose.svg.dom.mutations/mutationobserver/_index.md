---
title: Class MutationObserver
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Mutations.MutationObserver classe. AMutationObserver Loggetto può essere utilizzato per osservare le mutazioni dellalbero diNode .
type: docs
weight: 1120
url: /it/net/aspose.svg.dom.mutations/mutationobserver/
---
## MutationObserver class

A`MutationObserver` L'oggetto può essere utilizzato per osservare le mutazioni dell'albero di[`Node`](../../aspose.svg.dom/node/) .

```csharp
public class MutationObserver : DOMObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [MutationObserver](mutationobserver/)(MutationCallback) | Costruisce un oggetto MutationObserver e imposta il suo[`MutationCallback`](../mutationcallback/) richiamare. Il callback viene richiamato con un elenco di oggetti MutationRecord come primo argomento e l'oggetto MutationObserver costruito come secondo argomento. Viene richiamato dopo che i nodi si sono registrati con il!:Observe(Node, IMutationObserverInit) metodo, sono mutati. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Disconnect](../../aspose.svg.dom.mutations/mutationobserver/disconnect/)() | Impedisce all'osservatore di osservare eventuali mutazioni. Fino a quando non viene utilizzato nuovamente il metodo Observ(), il callback dell'osservatore non verrà richiamato. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe)(Node) | Indica all'agente utente di osservare un determinato target (un nodo) e di segnalare eventuali mutazioni in base ai criteri forniti dalle opzioni (un oggetto). L'argomento options consente di impostare le opzioni di osservazione delle mutazioni tramite i membri dell'oggetto. |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe_1)(Node, MutationObserverInit) | Indica all'agente utente di osservare un determinato target (un nodo) e di segnalare eventuali mutazioni in base ai criteri forniti dalle opzioni (un oggetto). L'argomento options consente di impostare le opzioni di osservazione delle mutazioni tramite i membri dell'oggetto. |
| [TakeRecords](../../aspose.svg.dom.mutations/mutationobserver/takerecords/)() | Il metodo restituisce una copia della coda dei record e quindi svuota la coda dei record. |

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject/)
* spazio dei nomi [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* assemblea [Aspose.SVG](../../)


