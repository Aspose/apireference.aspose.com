---
title: Interface IDocumentTraversal
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Traversal.IDocumentTraversal interfaccia. DocumentTraversal contiene metodi che creano iteratori e treewalker per attraversare un nodo e i suoi figli nellordine del documento profondità prima attraversamento preordinato che è equivalente allordine in cui i tag di inizio si verificano nella rappresentazione testuale di il documento. Nei DOM che supportano la funzione Traversal DocumentTraversal sarà implementato dagli stessi oggetti che implementano linterfaccia Document.
type: docs
weight: 1220
url: /it/net/aspose.svg.dom.traversal/idocumenttraversal/
---
## IDocumentTraversal interface

DocumentTraversal contiene metodi che creano iteratori e tree-walker per attraversare un nodo e i suoi figli nell'ordine del documento (profondità prima, attraversamento preordinato, che è equivalente all'ordine in cui i tag di inizio si verificano nella rappresentazione testuale di il documento). Nei DOM che supportano la funzione Traversal, DocumentTraversal sarà implementato dagli stessi oggetti che implementano l'interfaccia Document.

Vedi anche il[Document object Model (DOM) Livello 2 Traversal e Range Specification](http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113). @since DOM Level 2

```csharp
public interface IDocumentTraversal
```

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateNodeIterator](../../aspose.svg.dom.traversal/idocumenttraversal/createnodeiterator/#createnodeiterator)(Node) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateNodeIterator](../../aspose.svg.dom.traversal/idocumenttraversal/createnodeiterator/#createnodeiterator_1)(Node, long) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateNodeIterator](../../aspose.svg.dom.traversal/idocumenttraversal/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateTreeWalker](../../aspose.svg.dom.traversal/idocumenttraversal/createtreewalker/#createtreewalker)(Node) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |
| [CreateTreeWalker](../../aspose.svg.dom.traversal/idocumenttraversal/createtreewalker/#createtreewalker_1)(Node, long) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |
| [CreateTreeWalker](../../aspose.svg.dom.traversal/idocumenttraversal/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* assemblea [Aspose.SVG](../../)


