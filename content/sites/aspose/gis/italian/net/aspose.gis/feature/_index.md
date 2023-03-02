---
title: Class Feature
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Feature classe. Un elemento geografico composto da una geometria e attributi definiti dallutente.
type: docs
weight: 130
url: /it/net/aspose.gis/feature/
---
## Feature class

Un elemento geografico composto da una geometria e attributi definiti dall'utente.

```csharp
public class Feature
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Ottiene o imposta la geometria dell'elemento. Non può essere`null` , utilizzo[`Null`](../../aspose.gis.geometries/geometry/null/) per indicare la geometria mancante. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Copia i valori degli attributi da un'altra caratteristica. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Ottiene il valore di un attributo. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Ottiene il valore di un attributo. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Ottiene il valore di un attributo, o[`DefaultValue`](../featureattribute/defaultvalue/) se il valore non è impostato o`nullo` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Ottiene il valore di un attributo, o[`DefaultValue`](../featureattribute/defaultvalue/) se il valore non è impostato o`nullo` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Ottiene il valore di un attributo, o[`DefaultValue`](../featureattribute/defaultvalue/) se il valore non è impostato o`nullo` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Restituisce i valori per tutti gli attributi in un array. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Restituisce i valori per tutti gli attributi in un array. Si consideri l'utilizzo[`GetValues`](./getvalues/) metodo per evitare l'allocazione di memoria aggiuntiva. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Ottiene i valori di una sequenza di attributi come elenco. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Determina se l'attributo specificato è stato impostato esplicitamente su`nullo` valore. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Verifica se il valore dell'attributo è impostato in questa funzione. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Imposta un nuovo valore di un attributo. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Imposta il valore dell'attributo su`nullo` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Imposta nuovi valori per tutti gli attributi. Considera anche di utilizzare[`CopyValues`](./copyvalues/) metodo per semplificare i valori di impostazione in una chiamata. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Rimuove il valore dell'attributo da questa caratteristica. |

### Guarda anche

* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


