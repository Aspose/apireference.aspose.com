---
title: Aspose.Gis.SpatialReferencing
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing El espacio de nombres proporciona clases para trabajar con referencias espaciales sistemas de referencia de coordenadas.
type: docs
weight: 330
url: /es/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` El espacio de nombres proporciona clases para trabajar con referencias espaciales (sistemas de referencia de coordenadas).

## Clases

| Clase | Descripción |
| --- | --- |
| [Axis](./axis) | Un eje describe una dimensión de SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Clase que contiene parámetros de fórmula Bursa-Wolf para transformar a otro dato. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | SRS compuesto une dos SRS subyacentes, ninguno de los cuales puede ser compuesto. |
| [Ellipsoid](./ellipsoid) | Elipsoide representa un elipsoide, que se aproxima a la tierra. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | El SRS geocéntrico es un SRS cartesiano tridimensional con origen en el centro de la Tierra. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Parámetros para crear SRS geocéntrico. Los parámetros tienen valores predeterminados razonables, por lo que deberá asignar solo algunos de ellos. Si asigna`null` a cualquier parámetro, se utilizará un valor predeterminado. |
| [GeographicDatum](./geographicdatum) | El dato geográfico relaciona la longitud y la latitud con un lugar particular de la tierra. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Un SRS geográfico es un SRS que se basa en la longitud y la latitud. Un SRS geográfico puede ser bidimensional o tridimensional. Si el SRS geográfico es tridimensional, entonces en realidad es un SRS compuesto de SRS bidimensional y SRS vertical. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Parámetros para crear SRS geográficos. Los parámetros tienen valores predeterminados razonables, por lo que deberá asignar solo algunos de ellos. Si asigna`null` a cualquier parámetro, se utilizará un valor predeterminado. |
| [IdentifiableObject](./identifiableobject) | Representa un objeto que puede tener código y nombre EPSG. |
| [Identifier](./identifier) | Representa un identificador: una referencia a la descripción externa de un objeto. Si crea un SRS desde WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier) corresponde a la palabra clave "AUTHORITY". |
| [LocalDatum](./localdatum) | Indica el método utilizado para las mediciones en el sistema de referencia espacial local. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Coordenadas relacionadas con el SRS local a algún objeto, no a la tierra. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian representa un meridiano en el que la longitud se define como 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | El SRS proyectado es el resultado de la aplicación de una proyección al SRS geográfico. Un SRS proyectado puede ser bidimensional o tridimensional. Si el SRS proyectado es tridimensional, entonces en realidad es un SRS compuesto de SRS proyectado bidimensional y vertical unidimensional. SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Parámetros para crear SRS proyectado. Algunos de los parámetros tienen valores predeterminados. Algunos parámetros tienen valores predeterminados razonables, por lo que no tiene que asignarlos solo. Si asigna`null` a esos parámetros, se utilizará un valor predeterminado. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) y[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) no tiene valores predeterminados - tiene que asignar algunos no`null` valor a estas propiedades. |
| [Projection](./projection) | Representa un método de proyección con parámetros, que transforma (longitud, latitud) a (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | El sistema de referencia espacial asigna coordenadas a lugares de la Tierra. Hay diferentes tipos de SRS, consulte[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . Además, si el tipo de SRS esGeographic or Projected SRS puede ser compuesto o simple, ver[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | La transformación del sistema de referencia espacial transforma geometrías del sistema de referencia espacial de origen al sistema de referencia espacial de destino. |
| [TransformationException](./transformationexception) | Se genera una excepción de transformación cuando se produce un error durante la transformación de coordenadas o durante la creación de la transformación. |
| [Unit](./unit) | Representa la unidad de medida. |
| [VerticalDatum](./verticaldatum) | Indica el método utilizado para las medidas verticales. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Vertical SRS es un SRS unidimensional que describe coordenadas de altura. |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [AxisDirection](./axisdirection) | La dirección del eje define la dirección a la que apunta el eje. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Representa el orden de los ejes en SRS geocéntrico. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Representa el orden de los ejes en el SRS geográfico. |
| [ParameterType](./parametertype) | Determina el tipo de parámetro en[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Representa el orden de los ejes en el SRS geográfico. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Representa el tipo de sistema de referencia espacial. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
