---
title: Image.UnitType
second_title: Aspose.CAD for .NET API Reference
description: Image property. Gets current unit type
type: docs
weight: 100
url: /net/aspose.cad/image/unittype/
---
## Image.UnitType property

Gets current unit type.

```csharp
public UnitType UnitType { get; }
```

## Examples

Normalize export page size despite of unit type defined on drawing

```csharp
public static void ExportPageSizeNormalizationExample()
{
    using (CadImage cadImage = (CadImage)Image.Load("fileName.dwg"))
    {
        CadVportList viewPorts = cadImage.ViewPorts;
        CadVportTableObject table = (CadVportTableObject)viewPorts[0];
        Console.WriteLine(table.ViewTwistAngle.Value);

        bool currentUnitIsMetric = false;
        double currentUnitCoefficient = 1.0;
        var values = DefineUnitSystem(cadImage.UnitType);
        currentUnitIsMetric = values.Item1;
        currentUnitCoefficient = values.Item2;

        PngOptions pngOptions = new PngOptions();
        var rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.Layouts = new string[] { "Model" };

        if (currentUnitIsMetric)
        {
            double metersCoeff = 1 / 1000.0;
            double scaleFactor = metersCoeff / currentUnitCoefficient;
            rasterizationOptions.PageWidth = (float)(210 * scaleFactor);
            rasterizationOptions.PageHeight = (float)(297 * scaleFactor);
            rasterizationOptions.UnitType = UnitType.Millimeter;
        }
        else
        {
            rasterizationOptions.PageWidth = (float)(8.27f / currentUnitCoefficient);
            rasterizationOptions.PageHeight = (float)(11.69f / currentUnitCoefficient);
            rasterizationOptions.UnitType = UnitType.Inch;
        }

        pngOptions.VectorRasterizationOptions = rasterizationOptions;
        cadImage.Save("fileName.png", pngOptions);
    }
}

protected static Tuple<bool, double> DefineUnitSystem(UnitType unitType)
{
    var isMetric = false;
    var coefficient = 1.0;

    switch (unitType)
    {
        case UnitType.Parsec:
            coefficient = 3.0857 * 10000000000000000.0;
            isMetric = true;
            break;
        case UnitType.LightYear:
            coefficient = 9.4607 * 1000000000000000.0;
            isMetric = true;
            break;
        case UnitType.AstronomicalUnit:
            coefficient = 1.4960 * 100000000000.0;
            isMetric = true;
            break;
        case UnitType.Gigameter:
            coefficient = 1000000000.0;
            isMetric = true;
            break;
        case UnitType.Kilometer:
            coefficient = 1000.0;
            isMetric = true;
            break;
        case UnitType.Decameter:
            isMetric = true;
            coefficient = 10.0;
            break;
        case UnitType.Hectometer:
            isMetric = true;
            coefficient = 100.0;
            break;
        case UnitType.Meter:
            isMetric = true;
            coefficient = 1.0;
            break;
        case UnitType.Centimenter:
            isMetric = true;
            coefficient = 0.01;
            break;
        case UnitType.Decimeter:
            isMetric = true;
            coefficient = 0.1;
            break;
        case UnitType.Millimeter:
            isMetric = true;
            coefficient = 0.001;
            break;
        case UnitType.Micrometer:
            isMetric = true;
            coefficient = 0.000001;
            break;
        case UnitType.Nanometer:
            isMetric = true;
            coefficient = 0.000000001;
            break;
        case UnitType.Angstrom:
            isMetric = true;
            coefficient = 0.0000000001;
            break;
        case UnitType.Inch:
            coefficient = 1.0;
            break;
        case UnitType.MicroInch:
            coefficient = 0.000001;
            break;
        case UnitType.Mil:
            coefficient = 0.001;
            break;
        case UnitType.Foot:
            coefficient = 12.0;
            break;
        case UnitType.Yard:
            coefficient = 36.0;
            break;
        case UnitType.Mile:
            coefficient = 63360.0;
            break;
    }

    return new Tuple<bool, double>(isMetric, coefficient);
}
```

### See Also

* enum [UnitType](../../../aspose.cad.imageoptions/unittype/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


