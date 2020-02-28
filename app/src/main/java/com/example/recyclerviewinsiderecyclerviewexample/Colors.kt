package com.example.recyclerviewinsiderecyclerviewexample

data class Colors(
    var objectsArray: ArrayList<Vertical_RVModel> = arrayListOf(
        Vertical_RVModel(
            "Category #1", arrayListOf("SubCategory #1.1", "SubCategory #1.2"),
            arrayListOf(
                // SubCategory #1.1
                arrayListOf(
                    Horizontal_RVModel("#DA70D6", "Orchid"),
                    Horizontal_RVModel("#FA8072", "Salmon"),
                    Horizontal_RVModel("#FDF5E6", "Old Lace"),
                    Horizontal_RVModel("#00FFFF", "Aqua"),
                    Horizontal_RVModel("#2E8B57", "Sea Green")
                ),
                // SubCategory #1.2
                arrayListOf(
                    Horizontal_RVModel("#2F4F4F", "Dark Slate Gray"),
                    Horizontal_RVModel("#F0FFF0", "Honeydew"),
                    Horizontal_RVModel("#DCDCDC", "Gainsboro")
                )
            )
        ),
        Vertical_RVModel(
            "Category #2", arrayListOf("SubCategory #2.1"),
            arrayListOf(
                // SubCategory #2.1
                arrayListOf(
                    Horizontal_RVModel("#FFE4B5", "Moccasin"),
                    Horizontal_RVModel("#AFEEEE", "Pale Turquoise"),
                    Horizontal_RVModel("#9400D3", "Dark Violet"),
                    Horizontal_RVModel("#3CB371", "Medium Sea Green")
                )
            )
        ),
        Vertical_RVModel(
            "Category #3", arrayListOf("SubCategory #3.1", "SubCategory #3.2"),
            arrayListOf(
                // SubCategory #3.1
                arrayListOf(
                    Horizontal_RVModel("#FF6347", "Tomato"),
                    Horizontal_RVModel("#4682B4", "Steel Blue"),
                    Horizontal_RVModel("#778899", "Light Slate Gray"),
                    Horizontal_RVModel("#191970", "Midnight Blue"),
                    Horizontal_RVModel("#A52A2A", "Brown")
                ),
                // SubCategory #3.2
                arrayListOf(
                    Horizontal_RVModel("#FFF8DC", "Cornsilk"),
                    Horizontal_RVModel("#FF00FF", "Magenta"),
                    Horizontal_RVModel("#7CFC00", "Lawn Green"),
                    Horizontal_RVModel("#000000", "Black"),
                    Horizontal_RVModel("#00BFFF", "Deep Sky Blue"),
                    Horizontal_RVModel("#6495ED", "Cornflower Blue"),
                    Horizontal_RVModel("#FF8C00", "Dark Orange"),
                    Horizontal_RVModel("#20B2AA", "Light Sea Green"),
                    Horizontal_RVModel("#FFC0CB", "Pink")
                )
            )
        ),
        Vertical_RVModel(
            "Category #4", arrayListOf("SubCategory #4.1", "SubCategory #4.2"),
            arrayListOf(
                // SubCategory #4.1
                arrayListOf(
                    Horizontal_RVModel("#DDA0DD", "Plum"),
                    Horizontal_RVModel("#FFF5EE", "Seashell"),
                    Horizontal_RVModel("#FFDEAD", "Navajo White"),
                    Horizontal_RVModel("#00FF00", "Lime"),
                    Horizontal_RVModel("#F0E68C", "Khaki")
                ),
                // SubCategory #4.2
                arrayListOf(
                    Horizontal_RVModel("#FAEBD7", "Antique White"),
                    Horizontal_RVModel("#C71585", "Medium Violet Red"),
                    Horizontal_RVModel("#6B8E23", "Olive Drab"),
                    Horizontal_RVModel("#FF4500", "Orange Red"),
                    Horizontal_RVModel("#FFF0F5", "Lavender Blush")
                )
            )
        ),
        Vertical_RVModel(
            "Category #5", arrayListOf("SubCategory #5.1", "SubCategory #5.2"),
            arrayListOf(
                // SubCategory #5.1
                arrayListOf(
                    Horizontal_RVModel("#9966CC", "Amethyst")
                ),
                // SubCategory #5.2
                arrayListOf(
                    Horizontal_RVModel("#7B68EE", "Medium Slate Blue"),
                    Horizontal_RVModel("#800000", "Maroon"),
                    Horizontal_RVModel("#FFA07A", "Light Salmon"),
                    Horizontal_RVModel("#E6E6FA", "Lavender"),
                    Horizontal_RVModel("#FFE4C4", "Bisque")
                )
            )
        )
    )
)