package grails.swaggydoc.demo

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import com.github.rahulsom.swaggydoc.*
import com.wordnik.swagger.annotations.*
import grails.converters.*

@Transactional(readOnly = true)
@Api(value = 'demo')
class DemoController {

    @ApiOperation(value = 'List products', httpMethod = "GET")
    @ApiImplicitParams([
            @ApiImplicitParam(name = 'param_one', paramType = 'path', dataType = 'string'),
            @ApiImplicitParam(name = 'param_two', paramType = 'path', dataType = 'string'),
            @ApiImplicitParam(name = 'param_three', paramType = 'path', dataType = 'string')
    ])
    def test(String param_one, String param_two, String param_three) {
        render params as JSON
    }
}
