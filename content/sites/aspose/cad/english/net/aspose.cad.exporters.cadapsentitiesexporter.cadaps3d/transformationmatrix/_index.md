---
title: Class TransformationMatrix
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Exporters.CadApsEntitiesExporter.CadAps3D.TransformationMatrix class. Represents 3d transformation matrix
type: docs
weight: 770
url: /net/aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/
---
## TransformationMatrix class

Represents 3d transformation matrix

```csharp
public class TransformationMatrix : ICloneable
```

## Constructors

| Name | Description |
| --- | --- |
| [TransformationMatrix](transformationmatrix/#constructor)() | Initializes a new instance of the `TransformationMatrix` class |
| [TransformationMatrix](transformationmatrix/#constructor_1)(double[], bool) | Initializes a new instance of the `TransformationMatrix` class. |

## Properties

| Name | Description |
| --- | --- |
| [Matrix](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/matrix/) { get; set; } | Gets or sets transformation matrix. |

## Methods

| Name | Description |
| --- | --- |
| static [Axonometric](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/axonometric/)(double, double) | Axonometric projection |
| static [Copy](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/copy/)(TransformationMatrix) | Performs copy of one TransformationMatrix into other. |
| static [FromAxis](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/fromaxis/)(Point3D, Point3D, Point3D) | From the axis. |
| static [FrontView](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/frontview/)() | FrontView matrix |
| static [GetWCS](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/getwcs/)(Point3D) | WCSs the specified normal vector. |
| static [OCStoWCS](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/ocstowcs/)(Point3D) | Transforms OCS coordinates to WSC |
| static [Perspective](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/perspective/)(double, double, double, double, double) | Creates perspective matrix. |
| static [RotateX](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/rotatex/)(double) | Rotation matrix around X |
| static [RotateY](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/rotatey/)(double) | Rotation matrix around Y |
| static [RotateZ](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/rotatez/)(double) | Rotation matrix around Z |
| static [Scale](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/scale/)(double, double, double) | Scaling of a matrix |
| static [SideView](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/sideview/)() | SideView matrix |
| static [TopView](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/topview/)() | TopView matrix |
| static [Translate](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/translate/)(double, double, double) | Translation matrix |
| static [Transpose](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/transpose/)(TransformationMatrix) | Performs transposing of matrix. |
| static [UcsToWcs](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/ucstowcs/)(Point3D, Point3D) | Ucses to WCS. |
| [Clone](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/clone/)() | Creates a new object that is a copy of the current instance. |
| [Determinant](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/determinant/)() | Estimates determinant of a matrix. |
| [Invert](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/invert/)() | Given an nXn matrix A, solve n linear equations to find the inverse of A. |
| [VectorMultiply](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/vectormultiply/)(double[]) | Applies transformation to point |
| [operator +](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/op_addition/) | Performs summation of two matrices. |
| [operator *](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/transformationmatrix/op_multiply/#op_multiply_1) | Multiplies matrix by value. (2 operators) |

### See Also

* namespace [Aspose.CAD.Exporters.CadApsEntitiesExporter.CadAps3D](../../aspose.cad.exporters.cadapsentitiesexporter.cadaps3d/)
* assembly [Aspose.CAD](../../)


