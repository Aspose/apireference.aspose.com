---
title: SVGListBase1.ReplaceItem
second_title: Riferimento API Aspose.SVG per .NET
description: SVGListBase metodo. Sostituisce un elemento esistente nellelenco con un nuovo elemento.
type: docs
weight: 110
url: /it/net/aspose.svg.collections/svglistbase-1/replaceitem/
---
## SVGListBase&lt;T&gt;.ReplaceItem method

Sostituisce un elemento esistente nell'elenco con un nuovo elemento.

```csharp
public T ReplaceItem(T newItem, ulong index)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| newItem | T | L'elemento che deve essere inserito nell'elenco. |
| index | UInt64 | L'indice dell'elemento che deve essere sostituito. Il primo elemento è il numero 0. |

### Valore di ritorno

L'elemento inserito.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Generato quando l'elenco non può essere modificato. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Generato se il numero di indice è maggiore o uguale a numberOfItems. |

### Guarda anche

* class [SVGListBase&lt;T&gt;](../)
* spazio dei nomi [Aspose.Svg.Collections](../../svglistbase-1/)
* assemblea [Aspose.SVG](../../../)


