---
title: "Método System::DateTime::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page para C++"
description: "Cómo usar el método TryParse de la clase System::DateTime en C++."
type: docs
weight: 6900
url: /es/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ver también

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ver también

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Convierte la representación de cadena especificada de un valor de fecha y hora al objeto [DateTime](../) equivalente utilizando la información de formato y estilo específicos de la cultura especificada.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | const String\& | La representación en cadena de un valor de fecha y hora a convertir. |
| provider | const SharedPtr\<IFormatProvider\>\& | El objeto [IFormatProvider](../../iformatprovider/) que proporciona información de formato específica de la cultura. |
| styles | Globalization::DateTimeStyles | Una combinación bit a bit de los valores de enumeración que proporciona información adicional sobre **s**, sobre los elementos de estilo que pueden estar presentes en **s**, o sobre la conversión de **s** a un objeto [DateTime](../). |
| resultado | DateTime\& | El argumento de salida que, si la conversión tiene éxito, contiene el resultado de la conversión. |

### ReturnValue

Verdadero si la conversión tiene éxito, de lo contrario - falso.

## Ver también

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Convierte la representación de cadena especificada de un valor de fecha y hora al objeto [DateTime](../) equivalente.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | const String\& | La representación en cadena de un valor de fecha y hora a convertir. |
| resultado | DateTime\& | El argumento de salida que, si la conversión tiene éxito, contiene el resultado de la conversión. |

### ReturnValue

Verdadero si la conversión tiene éxito, de lo contrario - falso.

## Ver también

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ver también

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
