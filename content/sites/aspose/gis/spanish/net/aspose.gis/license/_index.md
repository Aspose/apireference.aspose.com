---
title: Class License
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.License clase. Proporciona métodos para licenciar el componente.
type: docs
weight: 1270
url: /es/net/aspose.gis/license/
---
## License class

Proporciona métodos para licenciar el componente.

```csharp
public class License
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [License](license/)() | Constructor predeterminado |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Licencia el componente. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Licencia el componente. |

### Ejemplos

En este ejemplo, se intentará encontrar un archivo de licencia llamado MyLicense.lic en la carpeta que contiene el componente, en la carpeta que contiene el conjunto de llamada, en la carpeta del conjunto de entrada y luego en el recursos incrustados del ensamblado que llama.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Ver también

* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


