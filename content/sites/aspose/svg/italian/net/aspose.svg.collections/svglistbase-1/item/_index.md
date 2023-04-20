---
title: SVGListBase1.Item
second_title: Riferimento API Aspose.SVG per .NET
description: SVGListBase proprietà. Restituisce lindice dellelemento nellelenco.
type: docs
weight: 10
url: /it/net/aspose.svg.collections/svglistbase-1/item/
---
## SVGListBase&lt;T&gt; indexer

Restituisce l'indice dell'elemento nell'elenco.

```csharp
public T this[ulong index] { get; set; }
```

| Parametro | Descrizione |
| --- | --- |
| index | Indice nell'elenco. |

### Valore di ritorno

L'oggetto archiviato nella posizione index dell'elenco.

### Valore della proprietà

Il tipo di elemento memorizzato nell'elenco.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Sollevato quando l'elenco non può essere modificato. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Generato se il numero di indice è maggiore o uguale a numberOfItems. |

### Guarda anche

* class [SVGListBase&lt;T&gt;](../)
* spazio dei nomi [Aspose.Svg.Collections](../../svglistbase-1/)
* assemblea [Aspose.SVG](../../../)


