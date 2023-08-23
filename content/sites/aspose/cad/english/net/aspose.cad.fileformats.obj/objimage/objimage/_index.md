---
title: ObjImage.ObjImage
second_title: Aspose.CAD for .NET API Reference
description: ObjImage constructor. Initializes a new instance of the ObjImage class
type: docs
weight: 10
url: /net/aspose.cad.fileformats.obj/objimage/objimage/
---
## ObjImage constructor

Initializes a new instance of the [`ObjImage`](../) class.

```csharp
public ObjImage(ObjRoot objRoot)
```

| Parameter | Type | Description |
| --- | --- | --- |
| objRoot | ObjRoot | ObjRoot object with vertices and shapes. |

## Examples

Creates new ObjRoot object, fills it with vertices and single face, exports into PNG format.

```csharp
ObjRoot root = new ObjRoot(); 
root.Materials.Add(new ObjMaterial() { Diffuse = new Obj3Values(1, 0, 0) });

root.Vertices.Add(new ObjVertex(0, 0, 0));
root.Vertices.Add(new ObjVertex(100, 100, 100));
root.Vertices.Add(new ObjVertex(100, 200, 300));
   
ObjShape newShape = new ObjShape();
newShape.MaterialId = root.Materials.Count - 1;

ObjFace newFace = new ObjFace();
newFace.VertexTextureNormals.Add(new ObjVertexTextureNormalIndex() { VertexIndex = root.Vertices.Count - 3 });
newFace.VertexTextureNormals.Add(new ObjVertexTextureNormalIndex() { VertexIndex = root.Vertices.Count - 2 });
newFace.VertexTextureNormals.Add(new ObjVertexTextureNormalIndex() { VertexIndex = root.Vertices.Count - 1 });
newShape.Faces.Add(newFace);
root.Shapes.Add(newShape);

using (ObjImage newImage = new ObjImage(root))
{
CadRasterizationOptions options = new CadRasterizationOptions();
options.PageHeight = 300;
options.PageWidth = 300;
options.DrawType = CadDrawTypeMode.UseObjectColor;
newImage.Save(outputPngFile, new PngOptions() { VectorRasterizationOptions = options});
};
```

### See Also

* class [ObjRoot](../../../aspose.cad.fileformats.obj.elements/objroot/)
* class [ObjImage](../)
* namespace [Aspose.CAD.FileFormats.Obj](../../../aspose.cad.fileformats.obj/)
* assembly [Aspose.CAD](../../../)


