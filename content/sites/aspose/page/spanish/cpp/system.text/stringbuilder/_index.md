---
title: "System::Text::StringBuilder clase"
linktitle: "StringBuilder"
second_title: "Aspose.Page para C++"
description: "System::Text::StringBuilder clase. Búfer para acumular cadenas parte a parte. Este tipo puede ser asignado tanto en la pila como tipo de valor o en el montón usando la función System::MakeObject(). Una vez que el objeto está asignado, nunca mezcle estos dos casos de uso: tener punteros SmartPtr a objetos asignados en la pila está estrictamente prohibido en C++."
type: docs
weight: 2400
url: /es/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Append](./append/)(char_t) | Añade un carácter al builder. |
| [Append](./append/)(char_t, int) | Añade caracteres al builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Añade una matriz de caracteres al builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Añade una porción de la matriz de caracteres al builder. |
| [Append](./append/)(const String\&) | Añade una cadena al builder. |
| [Append](./append/)(const String\&, int, int) | Añade una porción de cadena al builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Añade la representación en cadena del objeto al builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Añade el contenido del builder al builder. |
| [Append](./append/)(float) | Añade un valor de punto flotante al builder. |
| [Append](./append/)(double) | Añade un valor de punto flotante al builder. |
| [Append](./append/)(int) | Añade un valor entero al builder. |
| [Append](./append/)(T) | Añade un valor aritmético al builder. |
| [Append](./append/)(E) | Agrega la representación en cadena del valor enum al constructor. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Añade una cadena formateada al constructor. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Añade una cadena formateada al constructor. |
| [AppendLine](./appendline/)() | Añade el carácter de nueva línea al constructor. |
| [AppendLine](./appendline/)(const String\&) | Añade una cadena seguida del carácter de nueva línea al constructor. |
| [Clear](./clear/)() | Elimina todos los caracteres del constructor. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Copia los datos del constructor en posiciones existentes del arreglo. |
| [get_Capacity](./get_capacity/)() const | Obtiene la capacidad actual del constructor de cadenas. |
| [get_Length](./get_length/)() const | Obtiene la longitud de la cadena actualmente en el constructor. |
| [idx_get](./idx_get/)(int) const | Obtiene el carácter en la posición especificada. |
| [idx_set](./idx_set/)(int, char_t) | Establece el carácter en la posición especificada. |
| [Insert](./insert/)(int, const String\&) | Inserta una cadena en la posición fija del constructor. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Inserta una cadena repetida en la posición fija del constructor. |
| [Insert](./insert/)(int, char_t) | Inserta un carácter en la posición fija del constructor. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Inserta caracteres en la posición fija del constructor. |
| [Insert](./insert/)(int, T) | Inserta un valor en la posición fija del constructor. |
| [operator[]](./operator[]/)(int) const | Obtiene el carácter en la posición especificada. |
| [Remove](./remove/)(int, int) | Elimina un fragmento del constructor. |
| [Replace](./replace/)(const String\&, const String\&) | Reemplaza una subcadena a través del constructor. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Reemplaza una subcadena a través del rango del constructor. |
| [Replace](./replace/)(char_t, char_t) | Reemplaza un carácter a través del constructor. |
| [Replace](./replace/)(char_t, char_t, int, int) | Reemplaza un carácter a través del rango del constructor. |
| [set_Capacity](./set_capacity/)(int) | Establece la capacidad actual del constructor de cadenas. |
| [set_Length](./set_length/)(int) | Trunca o amplía el constructor de cadenas a la longitud especificada. |
| [StringBuilder](./stringbuilder/)() | Constructor. |
| [StringBuilder](./stringbuilder/)(int) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Constructor. |
| [ToString](./tostring/)() const override | Obtiene la cadena actualmente contenida en el constructor. |
| [ToString](./tostring/)(int, int) const | Obtiene la subcadena actualmente contenida en el constructor. |
| [~StringBuilder](./~stringbuilder/)() | Destructor. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
