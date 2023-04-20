---
title: Class NodeFilter
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Traversal.Filters.NodeFilter classe. I filtri sono oggetti che sanno come filtrare i nodi.
type: docs
weight: 1210
url: /it/net/aspose.svg.dom.traversal.filters/nodefilter/
---
## NodeFilter class

I filtri sono oggetti che sanno come "filtrare" i nodi.

```csharp
public abstract class NodeFilter : DOMObject, INodeFilter
```

## Metodi

| Nome | Descrizione |
| --- | --- |
| abstract [AcceptNode](../../aspose.svg.dom.traversal.filters/nodefilter/acceptnode/)(Node) | Verifica se un nodo specificato è visibile nella vista logica di a TreeWalker o NodeIterator. Questa funzione verrà chiamata dall'implementazione di TreeWalker e NodeIterator; normalmente non viene richiamato direttamente dal codice utente . (Anche se potresti farlo se volessi usare lo stesso filtro per guidare la tua logica applicativa.) |
| override [GetPlatformType](../../aspose.svg.dom.traversal.filters/nodefilter/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [FILTER_ACCEPT](../../aspose.svg.dom.traversal.filters/nodefilter/filter_accept/) | Accetta il nodo. I metodi di navigazione definiti per NodeIterator o TreeWalker restituiranno questo node. |
| const [FILTER_REJECT](../../aspose.svg.dom.traversal.filters/nodefilter/filter_reject/) | Rifiuta il nodo. I metodi di navigazione definiti per NodeIterator o TreeWalker non restituiranno questo nodo. Per TreeWalker, anche i figli di questo nodo verranno rifiutati. I NodeIterator lo trattano come un sinonimo di FILTER_SKIP. |
| const [FILTER_SKIP](../../aspose.svg.dom.traversal.filters/nodefilter/filter_skip/) | Salta questo singolo nodo. I metodi di navigazione definiti per NodeIterator o TreeWalker non restituiranno questo nodo. Sia per NodeIterator che per TreeWalker, i figli di questo nodo saranno comunque considerati . |
| const [SHOW_ALL](../../aspose.svg.dom.traversal.filters/nodefilter/show_all/) | Mostra tutti i nodi. |
| const [SHOW_ATTRIBUTE](../../aspose.svg.dom.traversal.filters/nodefilter/show_attribute/) | Mostra i nodi Attr. Questo è significativo solo quando si crea un iteratore o un tree-walker con un nodo attributo come radice ; in questo caso, significa che l'attributo node apparirà nella prima posizione dell'iterazione o dell'attraversamento. Poiché gli attributi non sono mai figli di altri nodi, non vengono visualizzati durante l'attraversamento dell'albero del documento. |
| const [SHOW_CDATA_SECTION](../../aspose.svg.dom.traversal.filters/nodefilter/show_cdata_section/) | Mostra nodi CDATASection. |
| const [SHOW_COMMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_comment/) | Mostra nodi Commento. |
| const [SHOW_DOCUMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_document/) | Mostra i nodi del documento. |
| const [SHOW_DOCUMENT_FRAGMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_document_fragment/) | Mostra nodi DocumentFragment. |
| const [SHOW_DOCUMENT_TYPE](../../aspose.svg.dom.traversal.filters/nodefilter/show_document_type/) | Mostra nodi DocumentType. |
| const [SHOW_ELEMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_element/) | Mostra nodi elemento. |
| const [SHOW_ENTITY](../../aspose.svg.dom.traversal.filters/nodefilter/show_entity/) | Mostra nodi entità. Ciò è significativo solo quando si crea un iteratore o un tree-walker con un nodo Entità come radice ; in questo caso, significa che il nodo Entity apparirà nella prima posizione dell'attraversamento. Poiché le entità non fanno parte dell'albero del documento, non vengono visualizzate quando attraversa l'albero del documento. |
| const [SHOW_ENTITY_REFERENCE](../../aspose.svg.dom.traversal.filters/nodefilter/show_entity_reference/) | Mostra nodi EntityReference. |
| const [SHOW_NOTATION](../../aspose.svg.dom.traversal.filters/nodefilter/show_notation/) | Mostra i nodi di notazione. Ciò è significativo solo quando si crea un iteratore o un tree-walker con un nodo Notation come radice ; in questo caso, significa che il nodo Notation apparirà nella prima posizione dell'attraversamento . Poiché le notazioni non fanno parte dell'albero del documento, non appaiono quando si attraversa l'albero del documento. |
| const [SHOW_PROCESSING_INSTRUCTION](../../aspose.svg.dom.traversal.filters/nodefilter/show_processing_instruction/) | Mostra nodi ProcessingInstruction. |
| const [SHOW_TEXT](../../aspose.svg.dom.traversal.filters/nodefilter/show_text/) | Mostra nodi di testo. |

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject/)
* interface [INodeFilter](../../aspose.svg.dom.traversal/inodefilter/)
* spazio dei nomi [Aspose.Svg.Dom.Traversal.Filters](../../aspose.svg.dom.traversal.filters/)
* assemblea [Aspose.SVG](../../)


