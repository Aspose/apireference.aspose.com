---
title: PsDocument.Save
second_title: Referencia de la API de Aspose.Page para .NET
description: PsDocument método. Guarda el archivo PS/EPS en un dispositivo.
type: docs
weight: 220
url: /es/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Guarda el archivo PS/EPS en un dispositivo.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | Device | Un dispositivo de salida. |
| options | SaveOptions | Contiene indicadores que especifican la salida de errores generados durante la conversión. |

### Ver también

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* espacio de nombres [Aspose.Page.EPS](../../psdocument/)
* asamblea [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Guardados dados[`PsDocument`](../) como archivo EPS. Este método se usa solo después de actualizar los metadatos XMP. Guarda el archivo EPS inicial con los metadatos existentes actualizados o uno nuevo creado al llamar al método GetMetadata. En el último caso, se agrega todo el código PostScript y los comentarios EPS necesarios.

```csharp
public void Save(Stream epsStream)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| epsStream | Stream | Flujo de archivo EPS de salida. |

### Ver también

* class [PsDocument](../)
* espacio de nombres [Aspose.Page.EPS](../../psdocument/)
* asamblea [Aspose.Page](../../../)

---

## Save() {#save}

Guardados dados[`PsDocument`](../)como archivo EPS. Este método se usa solo cuando PsDocument se creó desde cero.

```csharp
public void Save()
```

### Ver también

* class [PsDocument](../)
* espacio de nombres [Aspose.Page.EPS](../../psdocument/)
* asamblea [Aspose.Page](../../../)


