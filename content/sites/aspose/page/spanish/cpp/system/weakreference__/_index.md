---
title: "System::WeakReference<> clase"
linktitle: "WeakReference<>"
second_title: "Aspose.Page para C++"
description: "Clase System::WeakReference<>. Representa una referencia débil, que hace referencia a un objeto mientras aún permite que ese objeto sea eliminado en C++."
type: docs
weight: 7800
url: /es/cpp/system/weakreference__/
---
## WeakReference<> class


Representa una referencia débil, que referencia a un objeto mientras aún permite que ese objeto sea eliminado.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Obtiene una indicación de si el objeto referenciado por el objeto [WeakReference](../weakreference/) actual ha sido eliminado. |
| [get_Target](./get_target/)() const | Obtiene el objeto (el objetivo) referenciado por el objeto [WeakReference](../weakreference/) actual. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Establece el objeto (el objetivo) referenciado por el objeto [WeakReference](../weakreference/) actual. |
| [WeakReference](./weakreference/)() | Constructor predeterminado. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Constructor a partir de nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Inicializa una nueva instancia de la clase [WeakReference](../weakreference/), referenciando el objeto especificado. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Inicializa una nueva instancia de la clase [WeakReference](../weakreference/), referenciando el objeto especificado. |
## Ver también

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
