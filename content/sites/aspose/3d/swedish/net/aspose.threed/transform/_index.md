---
title: Transform
second_title: Aspose.3D för .NET API-referens
description: En transformation innehåller information som tillåter åtkomst till objektets translate/scale/rotation eller transformationsmatris till lägsta kostnad Detta används av lokal transform.
type: docs
weight: 2400
url: /sv/net/aspose.threed/transform/
---
## Transform class

En transformation innehåller information som tillåter åtkomst till objektets translate/scale/rotation eller transformationsmatris till lägsta kostnad Detta används av lokal transform.

```csharp
public class Transform : A3DObject
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Hämtar eller ställer in rotationen representerad i Euler-vinklar, mätt i grader |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Hämtar eller ställer in den geometriska Euler-rotationen (mätt i grader). Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Hämtar eller ställer in den geometriska skalningen. Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Hämtar eller ställer in den geometriska översättningen. Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Hämtar eller ställer in namnet. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Hämtar eller ställer in efterrotationen representerad i degree |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Hämtar eller ställer in förrotationen representerad i degree |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Hämtar samlingen av alla egenskaper. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Hämtar eller ställer in rotationen representerad i quaternion. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Hämtar eller ställer in skalan |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Hämtar eller ställer in transformationsmatrisen. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Hämtar eller ställer in translation |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Hittar egenskapen. Det kan vara en dynamisk egenskap (Skapad av CreateDynamicProperty/SetProperty) eller inbyggd egenskap (identifierad med dess namn) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Få värdet av specificerad egenskap |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Tar bort en dynamisk egenskap. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Ta bort den angivna egenskapen identifierad av name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Ställer in Euler-vinklarna i grader av strömtransform. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Ställer in den geometriska Euler-rotationen (mätt i grader). Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Ställer in den geometriska skalningen. Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Ställer in den geometriska översättningen. Geometrisk transformation påverkar bara de entiteter som är bifogade och lämnar de underordnade noderna opåverkade. Den kommer att slås samman som lokal transformation när du exporterar den geometriska transformationen till filtyper som inte stöder den. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Ställer in efterrotationen representerad i degree |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Ställer in förrotationen representerad i degree |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Anger värdet för specificerad egenskap |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Ställer in rotationen (som kvartjonkomponenter) för aktuell transformation. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Ställer in skalan för aktuell transformation. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Ställer in översättningen av aktuell transformation. |

### Se även

* class [A3DObject](../a3dobject)
* namnutrymme [Aspose.ThreeD](../../aspose.threed)
* hopsättning [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
