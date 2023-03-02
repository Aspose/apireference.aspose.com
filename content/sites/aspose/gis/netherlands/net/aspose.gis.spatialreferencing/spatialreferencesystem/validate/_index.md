---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Bepaal of deze SRS geldig is.
type: docs
weight: 240
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

Bepaal of deze SRS geldig is.

```csharp
public abstract bool Validate(out string errorMessage)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| errorMessage | String& | Als methode retourneert`false` dan is dit een omschrijving van invaliditeit. |

### Winstwaarde

`true` als SRS geldig is,`false` anders.

### Opmerkingen

Geldige SRS moet een geldige ellipsoïde hebben. - Geografische SRS moet exact één oost/west-as, exact één noord/zuid-as en optionele omhoog/omlaag-as hebben (optionele as is aanwezig wanneer geografische SRS een samenstelling is van 2D geografische SRS en verticale SRS). - Geprojecteerde SRS moet exact één oost/west-as, exact één noord/zuid-as en optionele omhoog/omlaag-as hebben (optionele as is aanwezig wanneer geprojecteerde SRS een samenstelling is van 2D geografische SRS en verticale SRS). - Geocentrische SRS moet exact één oost/west-as, exact één noord/zuidas en exact één andere as hebben. - Verticale SRS moet exact één omhoog/omlaag-as hebben. - Lokale SRS moet minimaal één as hebben. De richtingen van de assen tellen niet. - Samengestelde SRS moet een combinatie zijn van een geldige geografische/geprojecteerde en een geldige verticale SRS.

### Zie ook

* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


