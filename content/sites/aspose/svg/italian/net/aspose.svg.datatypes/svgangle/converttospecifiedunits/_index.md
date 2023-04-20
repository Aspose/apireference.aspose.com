---
title: SVGAngle.ConvertToSpecifiedUnits
second_title: Riferimento API Aspose.SVG per .NET
description: SVGAngle metodo. Conserva lo stesso valore archiviato sottostante ma reimposta lidentificatore dellunità memorizzata sul tipo di unità specificato. Gli attributi delloggetto unitType valueInSpecifiedUnits e valueAsString potrebbero essere modificati come risultato di questo metodo.
type: docs
weight: 50
url: /it/net/aspose.svg.datatypes/svgangle/converttospecifiedunits/
---
## SVGAngle.ConvertToSpecifiedUnits method

Conserva lo stesso valore archiviato sottostante, ma reimposta l'identificatore dell'unità memorizzata sul tipo di unità specificato. Gli attributi dell'oggetto unitType, valueInSpecifiedUnits e valueAsString potrebbero essere modificati come risultato di questo metodo.

```csharp
public void ConvertToSpecifiedUnits(ushort unitType)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unitType | UInt16 | Il tipo di unità a cui passare (ad esempio, SVG_ANGLETYPE_DEG). |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Generato se unitType è SVG_ANGLETYPE_UNKNOWN o non è una costante del tipo di unità valida (una delle altre costanti SVG_ANGLETYPE_* definite su questa interfaccia). |
| [DOMException](../../../aspose.svg.dom/domexception/) | Codice[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Aumentato quando l'angolo corrisponde a un attributo di sola lettura o quando l'oggetto stesso è di sola lettura. |

### Guarda anche

* class [SVGAngle](../)
* spazio dei nomi [Aspose.Svg.DataTypes](../../svgangle/)
* assemblea [Aspose.SVG](../../../)


