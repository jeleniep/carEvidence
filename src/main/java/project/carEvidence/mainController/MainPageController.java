package project.carEvidence.mainController;

import javax.ws.rs.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import aj.org.objectweb.asm.Handle;
import de.westnordost.osmapi.OsmConnection;
import de.westnordost.osmapi.map.MapDataDao;
import de.westnordost.osmapi.map.data.BoundingBox;
import de.westnordost.osmapi.map.data.Node;
import de.westnordost.osmapi.map.data.Relation;
import de.westnordost.osmapi.map.data.Way;
import de.westnordost.osmapi.map.handler.MapDataHandler;

@Controller
public class MainPageController {

	@GET
	@RequestMapping(value = {"/", "/index", "/start"})
	public String showMainPage() {
		OsmConnection osm = new OsmConnection(
                "https://api.openstreetmap.org/api/0.6/",
                "my user agent", null);
		MapDataDao mapDataDao  = new MapDataDao(osm);
		BoundingBox bounds = new BoundingBox(0, 1, 0, 1);
		
		
	  Map
		
		

		return "index";
	}
	
}
