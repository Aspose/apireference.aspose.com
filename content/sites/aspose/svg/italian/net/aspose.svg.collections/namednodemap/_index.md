---
title: Class NamedNodeMap
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Collections.NamedNodeMap classe. Rappresenta raccolte di attributi a cui è possibile accedere per nome.
type: docs
weight: 30
url: /it/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

Rappresenta raccolte di attributi a cui è possibile accedere per nome.

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | Restituisce l'indice-esimo elemento nella mappa. Se index è maggiore o uguale al numero di nodi in questa mappa, restituisce null. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | Il numero di nodi in questa mappa. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | Restituisce un enumeratore che scorre la raccolta. |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | Recupera un nodo specificato per nome. |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | Recupera un nodo specificato dal nome locale e dall'URI dello spazio dei nomi. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | Rimuove un nodo specificato per nome. |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | Rimuove un nodo specificato dal nome locale e dall'URI dello spazio dei nomi. |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | Aggiunge un nodo usando il suo attributo nodeName. Se un nodo con quel nome è già presente in questa mappa, viene sostituito da quello nuovo. Sostituire un nodo da solo non ha alcun effetto. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | Aggiunge un nodo utilizzando il relativo namespaceURI e localName. Se un nodo con quell'URI dello spazio dei nomi e quel nome locale è già presente in questa mappa, viene sostituito da quello nuovo. Sostituire un nodo da solo non ha alcun effetto. |

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* spazio dei nomi [Aspose.Svg.Collections](../../aspose.svg.collections/)
* assemblea [Aspose.SVG](../../)


