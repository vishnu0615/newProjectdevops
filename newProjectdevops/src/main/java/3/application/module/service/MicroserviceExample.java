package 3.application.module.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import 3.application.module.request.MicroserviceExampleRequest;
import 3.application.module.response.MicroserviceExampleResponse;

@FeignClient("my-application")
public interface MicroserviceExample {

	@RequestMapping(value = "/exampleMethod", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public MicroserviceExampleResponse exampleMethod(@RequestBody MicroserviceExampleRequest request);

}
