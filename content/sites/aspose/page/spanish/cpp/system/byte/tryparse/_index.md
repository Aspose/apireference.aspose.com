---
title: "System::Byte::TryParse método"
linktitle: "TryParse"
second_title: "Aspose.Page para C++"
description: "Cómo usar el método TryParse de la clase System::Byte en C++."
type: docs
weight: 200
url: /es/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Ver también

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Ver también

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Convierte la cadena especificada que contiene la representación en cadena de un número al entero sin signo de 8 bits equivalente usando la información de formato y el estilo numérico proporcionados.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const String\& | La cadena a convertir. |
| estilos | Globalization::NumberStyles | Una combinación bit a bit de los valores del enumerado NumberStyles que especifica el estilo permitido de la representación textual de un número. |
| proveedor | const SharedPtr\<IFormatProvider\>\& | Un puntero a un objeto que contiene la información de formato de cadena. |
| resultado | uint8_t\& | La referencia a una variable de entero sin signo de 8 bits donde se coloca el resultado de la conversión. |

### ReturnValue

True si la conversión tuvo éxito, de lo contrario - false.

## Ver también

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Ver también

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Convierte la cadena especificada que contiene la representación en cadena de un número al entero sin signo de 8 bits equivalente.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const String\& | La cadena a convertir. |
| resultado | uint8_t\& | La referencia a una variable de entero sin signo de 8 bits donde se coloca el resultado de la conversión. |

### ReturnValue

True si la conversión tuvo éxito, de lo contrario - false.

## Ver también

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
