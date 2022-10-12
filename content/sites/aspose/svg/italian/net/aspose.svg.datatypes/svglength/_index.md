---
title: SVGLength
second_title: Riferimento API Aspose.SVG per .NET
description: Linterfaccia SVGLength corrisponde al tipo di dati di base della lunghezza. Un oggetto SVGLength può essere designato come di sola lettura il che significa che i tentativi di modifica delloggetto risulteranno nella generazione di uneccezione come descritto di seguito.
type: docs
weight: 220
url: /it/net/aspose.svg.datatypes/svglength/
---
## SVGLength class

L'interfaccia SVGLength corrisponde al tipo di dati di base della lunghezza. Un oggetto SVGLength può essere designato come di sola lettura, il che significa che i tentativi di modifica dell'oggetto risulteranno nella generazione di un'eccezione, come descritto di seguito.

```csharp
public class SVGLength : SVGValueType
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype) { get; } | Il tipo del valore come specificato da una delle costanti SVG_LENGTHTYPE_* definite su questa interfaccia. |
| [Value](../../aspose.svg.datatypes/svglength/value) { get; set; } | Il valore come valore in virgola mobile, in unità utente. L'impostazione di questo attributo farà sì che valueInSpecifiedUnits e valueAsString vengano aggiornati automaticamente per riflettere questa impostazione. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring) { get; set; } | Il valore come valore stringa, nelle unità espresse da unitType. L'impostazione di questo attributo farà sì che value, valueInSpecifiedUnits e unitType vengano aggiornati automaticamente per riflettere questa impostazione. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits) { get; set; } | Il valore come valore in virgola mobile, nelle unità espresse da unitType. L'impostazione di questo attributo farà sì che value e valueAsString vengano aggiornati automaticamente per riflettere questa impostazione. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits)(ushort) | Conserva lo stesso valore memorizzato sottostante, ma reimposta l'identificatore di unità memorizzato su unitType specificato. Gli attributi dell'oggetto unitType, valueInSpecifiedUnits e valueAsString potrebbero essere modificati come risultato di questo metodo. Ad esempio, se il valore originale fosse "0,5 cm" e il metodo fosse stato richiamato per la conversione in millimetri, unitType verrebbe modificato in SVG_LENGTHTYPE_MM, valueInSpecifiedUnits verrebbe modificato nel valore numerico 5 e valueAsString verrebbe modificato in "5 mm". |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Rilascia risorse non gestite e, facoltativamente, gestite. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits)(ushort, float) | Reimposta il valore come numero con un unitType associato, sostituendo così i valori per tutti gli attributi sull'oggetto. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring)() | Restituisce aString che rappresenta questa istanza. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm) | È stato specificato un valore utilizzando le unità cm definite in CSS2. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems) | È stato specificato un valore utilizzando le unità em definite in CSS2. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs) | È stato specificato un valore utilizzando le ex unità definite in CSS2. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in) | È stato specificato un valore utilizzando le unità in definite in CSS2. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm) | È stato specificato un valore utilizzando le unità mm definite in CSS2. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number) | Non è stato fornito alcun tipo di unità (ovvero è stato specificato un valore senza unità), che indica un valore in unità utente. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc) | È stato specificato un valore utilizzando le unità pc definite in CSS2. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage) | È stato specificato un valore percentuale. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt) | È stato specificato un valore utilizzando le unità pt definite in CSS2. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px) | È stato specificato un valore utilizzando le unità px definite in CSS2. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown) | Il tipo di unità non è uno dei tipi di unità predefiniti. Non è valido tentare di definire un nuovo valore di questo tipo o tentare di cambiare un valore esistente in questo tipo. |

### Guarda anche

* class [SVGValueType](../svgvaluetype)
* spazio dei nomi [Aspose.Svg.DataTypes](../../aspose.svg.datatypes)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
