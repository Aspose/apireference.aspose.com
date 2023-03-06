---
title: GeoConvert.ParsePointText
second_title: Referencia de API de Aspose.GIS para .NET
description: GeoConvert método. Convierte la cadena que contiene coordenadas en objeto IPoint.
type: docs
weight: 20
url: /es/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Convierte la cadena que contiene coordenadas en objeto IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| text | String | Una cadena que contiene coordenadas para convertir. La cadena debe contener coordenadas tanto de latitud como de longitud. Las coordenadas deben estar separadas por espacios en blanco, por coma o por punto y coma. |

### Valor_devuelto

Objeto IPoint con coordenadas equivalentes a la cadena de entrada.

### Excepciones

| excepción | condición |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Observaciones

Ejemplos: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Ver también

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* espacio de nombres [Aspose.Gis](../../geoconvert/)
* asamblea [Aspose.GIS](../../../)


