﻿---
title: ChartDataLabelCollection.rotation property
linktitle: rotation property
articleTitle: rotation property
second_title: Aspose.Words for Python
description: "ChartDataLabelCollection.rotation property. Gets or sets the rotation of the data labels of the entire series in degrees."
type: docs
weight: 80
url: /python-net/aspose.words.drawing.charts/chartdatalabelcollection/rotation/
---

## ChartDataLabelCollection.rotation property

Gets or sets the rotation of the data labels of the entire series in degrees.


```python
@property
def rotation(self) -> int:
    ...

@rotation.setter
def rotation(self, value: int):
    ...

```

### Remarks

The range of acceptable values is from -180 to 180 inclusive. The default value is 0.

If the [ChartDataLabelCollection.orientation](../orientation/) value is [ShapeTextOrientation.HORIZONTAL](../../../aspose.words.drawing/shapetextorientation/#HORIZONTAL), label shapes,
if they exist, are rotated along with the label text. Otherwise, only the label text is rotated.




### Examples

Shows how to change orientation and rotation for data labels.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
shape = builder.insert_chart(chart_type=aw.drawing.charts.ChartType.COLUMN, width=432, height=252)
series = shape.chart.series[0]
data_labels = series.data_labels
# Show data labels.
series.has_data_labels = True
data_labels.show_value = True
data_labels.show_category_name = True
# Define data label shape.
data_labels.format.shape_type = aw.drawing.charts.ChartShapeType.UP_ARROW
data_labels.format.stroke.fill.solid(aspose.pydrawing.Color.dark_blue)
# Set data label orientation and rotation for the entire series.
data_labels.orientation = aw.drawing.ShapeTextOrientation.VERTICAL_FAR_EAST
data_labels.rotation = -45
# Change orientation and rotation of the first data label.
data_labels[0].orientation = aw.drawing.ShapeTextOrientation.HORIZONTAL
data_labels[0].rotation = 45
doc.save(file_name=ARTIFACTS_DIR + 'Charts.LabelOrientationRotation.docx')
```

### See Also

* module [aspose.words.drawing.charts](../../)
* class [ChartDataLabelCollection](../)

