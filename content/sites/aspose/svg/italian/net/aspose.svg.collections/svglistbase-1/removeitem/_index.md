---
title: SVGListBase1.RemoveItem
second_title: Riferimento API Aspose.SVG per .NET
description: SVGListBase metodo. Rimuove un elemento esistente dallelenco.
type: docs
weight: 100
url: /it/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Rimuove un elemento esistente dall'elenco.

```csharp
public T RemoveItem(ulong index)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| index | UInt64 | L'indice dell'elemento che deve essere rimosso. Il primo elemento è il numero 0. |

### Valore di ritorno

L'elemento rimosso.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Generato quando l'elenco non può essere modificato. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Generato se il numero di indice è maggiore o uguale a numberOfItems. |

### Guarda anche

* class [SVGListBase&lt;T&gt;](../)
* spazio dei nomi [Aspose.Svg.Collections](../../svglistbase-1/)
* assemblea [Aspose.SVG](../../../)


