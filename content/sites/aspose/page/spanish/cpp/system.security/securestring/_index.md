---
title: "System::Security::SecureString clase"
linktitle: "SecureString"
second_title: "Aspose.Page para C++"
description: "System::Security::SecureString clase. Cadena segura, representa texto que debe mantenerse confidencial. Esta clase DON''T ENCRYPTING los datos internos. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.security/securestring/
---
## SecureString class


Cadena segura, representa texto que debe mantenerse confidencial. Esta clase DON'T ENCRYPTING los datos internos. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class SecureString : public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Añade un carácter al final de la cadena. |
| [Clear](./clear/)() | Elimina todos los caracteres de la cadena segura actual. |
| [Copy](./copy/)() const | Crea un duplicado de esta cadena segura. |
| [Dispose](./dispose/)() override | Libera todos los recursos utilizados por el objeto actual. |
| [get_Length](./get_length/)() const | Obtiene el número de caracteres en esta cadena segura. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Inserta un carácter en el índice especificado. |
| [IsReadOnly](./isreadonly/)() const | Obtiene la bandera que indica si este objeto está marcado como solo lectura. |
| [MakeReadOnly](./makereadonly/)() | Hace que esta cadena segura sea de solo lectura. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Elimina el carácter en la posición especificada. |
| [SecureString](./securestring/)() | Información RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Constructor. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Reemplaza el carácter existente en la posición especificada. |
| [ToUnsecureString](./tounsecurestring/)() const | Copia el contenido de esta cadena segura en un objeto [String](../../system/string/) inseguro. Úselo con precaución. |
| [~SecureString](./~securestring/)() | Destructor. |
## Ver también

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
